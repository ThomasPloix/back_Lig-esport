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
    role TEXT not null,
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
    date date not null,
    order_match int not null,
    team1_id int not null,
    team2_id int not null,
    result boolean,
    score TEXT not null,
    compete_id int not null,
    joueur_id int
);

create table champions
(
    id SERIAL PRIMARY KEY,
    name TEXT not null,
    title TEXT NOT NULL,
    lore TEXT NOT NULL,
    tags TEXT NOT NULL
);

create table player_champion
(
    id SERIAL PRIMARY KEY,
    player_id int not null,
    champion_id int not null
);

create table match_champion
(
    id SERIAL PRIMARY KEY,
    match_id int not null,
    champion_id int not null
);

