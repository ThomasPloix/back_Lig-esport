FROM postgres

ENV POSTGRES_DB=${DATABASE_NAME} \
    POSTGRES_USER=${DATABASE_USER} \
    POSTGRES_PASSWORD=${DATABASE_PASSWORD}

COPY *.sql /docker-entrypoint-initdb.d
RUN echo /docker-entrypoint-initdb.d/*.sql