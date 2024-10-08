create table students
(
    id SERIAL PRIMARY KEY,
    first_name TEXT not null,
    last_name TEXT not null,
    birthdate date null,
    major_id int null,
    image bytea null
);

create table majors
(
    id SERIAL PRIMARY KEY,
    name TEXT not null,
    description TEXT not null
);

create table courses
(
    id SERIAL PRIMARY KEY,
    name TEXT not null,
    hours int not null
);

create table student_course
(
    id SERIAL PRIMARY KEY,
    student_id int not null,
    course_id int not null
);

create table regions
(
    id SERIAL PRIMARY KEY,
    name TEXT not null,
    description TEXT not null,
    logo TEXT
);

create table teams
(
    id SERIAL PRIMARY KEY,
    name TEXT not null,
    description TEXT ,
    logo TEXT,
    date_created date not null,
    lieu TEXT not null,
    partners TEXT,
    region_id int not null

);

create table players
(
    id SERIAL PRIMARY KEY,
    first_name TEXT not null,
    last_name TEXT not null,
    pseudo TEXT not null,
    team_id int not null,
    image TEXT
);

create table competes
(
    id SERIAL PRIMARY KEY,
    name TEXT not null,
    region_id int not null
);

create table team_compete
(
    id SERIAL PRIMARY KEY,
    team_id int not null,
    compete_id int not null
);

create table matchs
(
    id SERIAL PRIMARY KEY,
    team1_id int not null,
    team2_id int not null,
    result boolean,
    score TEXT not null,
    joueur_id int not null
)