FROM postgres

ENV POSTGRES_DB=database \
    POSTGRES_USER=root \
    POSTGRES_PASSWORD=toor

COPY *.sql /docker-entrypoint-initdb.d
RUN echo /docker-entrypoint-initdb.d/*.sql