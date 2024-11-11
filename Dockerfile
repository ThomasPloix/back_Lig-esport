FROM maven:3.8.6-amazoncorretto-17 AS build
ENV APP_HOME=/app
WORKDIR $APP_HOME
COPY pom.xml .
COPY src ./src
RUN mvn package -DskipTests

FROM amazoncorretto:17
ENV APP_HOME=/app
WORKDIR $APP_HOME
COPY --from=build $APP_HOME/target/*.jar $APP_HOME/app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]