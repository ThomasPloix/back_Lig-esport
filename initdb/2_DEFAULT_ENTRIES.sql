INSERT INTO majors (id, name, description) VALUES (1, 'Informatique', 'Ouaiiis du code partout');
INSERT INTO majors (id, name, description) VALUES (2, 'Construction', 'Beaucoup de béton et des poutres');
INSERT INTO majors (id, name, description) VALUES (3, 'Aéronautique', 'Vive le vent');
INSERT INTO majors (id, name, description) VALUES (4, 'Data', 'Trop cool plein de données à ordonner');
INSERT INTO majors (id, name, description) VALUES (5, 'Energie & Environnement', 'On est full green');
INSERT INTO majors (id, name, description) VALUES (6, 'Management', 'Des managers de qualité');
INSERT INTO majors (id, name, description) VALUES (7, 'Santé', 'On connait tous les os et tous les muscles du corps humain');
INSERT INTO majors (id, name, description) VALUES (8, 'Architecture durable', 'Objectif 0 carbone');
INSERT INTO majors (id, name, description) VALUES (9, 'Design Industriel Durable', 'On resistera à la fin du pétrole');

INSERT INTO students (id, first_name, last_name, birthdate, major_id) VALUES (1, 'Paul', 'Harrohide', '2002-06-15', 1);
INSERT INTO students (id, first_name, last_name, birthdate, major_id) VALUES (2, 'Jean', 'Bonbeur', '2001-08-21', 1);
INSERT INTO students (id, first_name, last_name, birthdate, major_id) VALUES (3, 'Alain', 'Térieur', '2000-01-11', 1);

INSERT INTO courses (id, name, hours) VALUES (1, 'Spanish', 30);
INSERT INTO courses (id, name, hours) VALUES (2, 'German', 30);
INSERT INTO courses (id, name, hours) VALUES (3, 'Internet of Things', 30);
INSERT INTO courses (id, name, hours) VALUES (4, 'Thermodynamic', 30);
INSERT INTO courses (id, name, hours) VALUES (5, 'Anatomy', 30);
INSERT INTO courses (id, name, hours) VALUES (6, 'Maths', 30);
INSERT INTO courses (id, name, hours) VALUES (7, 'Java', 30);
INSERT INTO courses (id, name, hours) VALUES (8, 'Lean Management', 30);
INSERT INTO student_course (id, student_id, course_id) VALUES (1, 1, 7);

INSERT INTO regions (id, name, description, logo) VALUES (1, 'Europe', 'Le continent de la culture', 'https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/Flag_of_Europe.svg/1280px-Flag_of_Europe.svg.png');
INSERT INTO regions (id, name, description, logo) VALUES (2, 'Asie', 'Le continent de la diversité', 'https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Flag_of_Asia.svg/1280px-Flag_of_Asia.svg.png');
INSERT INTO regions (id, name, description, logo) VALUES (3, 'Afrique', 'Le continent de la chaleur', 'https://upload.wikimedia.org/wikipedia/commons/thumb/6/6a/Flag_of_Africa.svg/1280px-Flag_of_Africa.svg.png');
INSERT INTO regions (id, name, description, logo) VALUES (4, 'Amérique', 'Le continent de la liberté', 'https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Flag_of_America.svg/1280px-Flag_of_America.svg.png');

INSERT INTO competes (id, name, region_id) VALUES (1, 'LEC SUMMER 2024', 1);
INSERT INTO competes (id, name, region_id) VALUES (2, 'LCK SUMMER 2024', 2);
INSERT INTO competes (id, name, region_id) VALUES (3, 'LCS SUMMER 2024', 4);

INSERT INTO teams (id, name, description, logo, date_created, lieu, partners, region_id) VALUES (1, 'G2', 'Le sang', 'https://upload.wikimedia.org/wikipedia/fr/thumb/e/e4/G2_Esports.svg/langfr-800px-G2_Esports.svg.png', '2021-01-01', 'Berlin', 'Microsoft, Google', 1);
INSERT INTO teams (id, name, description, logo, date_created, lieu, partners, region_id) VALUES (2, 'T1', 'La sueur', 'https://fr.wikipedia.org/w/index.php?title=Fichier:T1_logo.svg&lang=fr', '2021-01-01', 'Séoul', 'Samsung, LG', 2);
INSERT INTO teams (id, name, description, logo, date_created, lieu, partners, region_id) VALUES (3, 'Cloud9', 'Les larmes', 'https://upload.wikimedia.org/wikipedia/fr/thumb/4/4b/Cloud9_logo.svg/langfr-800px-Cloud9_logo.svg.png', '2021-01-01', 'Los Angeles', 'Apple, Amazon', 4);


INSERT INTO players (id, first_name, last_name, pseudo, team_id, image) VALUES (1, 'Rasmus', 'Winther', 'Caps', 1, 'https://commons.wikimedia.org/wiki/File:Caps_G2_2020_(1).jpg?uselang=fr');
INSERT INTO players (id, first_name, last_name, pseudo, team_id, image) VALUES (2, 'Martin', 'Larsson', 'Rekkles', 1, 'https://commons.wikimedia.org/wiki/File:Rekkles_G2_2021.jpg?uselang=fr');
INSERT INTO players (id, first_name, last_name, pseudo, team_id, image) VALUES (3, 'Ryu', 'Min-seok', 'Keria', 2, 'https://commons.wikimedia.org/wiki/File:Keria_T1_2021.jpg?uselang=fr');
INSERT INTO players (id, first_name, last_name, pseudo, team_id, image) VALUES (4, 'Lee', 'Sang-hyeok', 'Faker', 2, 'https://commons.wikimedia.org/wiki/File:Faker_T1_2021.jpg?uselang=fr');
Insert Into players (id, first_name, last_name, pseudo, team_id, image) VALUES (5, 'Yasin', 'Dinçer', 'Nisqy', 3, 'https://commons.wikimedia.org/wiki/File:Nisqy_Cloud9_2021.jpg?uselang=fr');

INSERT INTO team_compete (id, team_id, compete_id) VALUES (1, 1, 1);
INSERT INTO team_compete (id, team_id, compete_id) VALUES (2, 2, 2);
INSERT INTO team_compete (id, team_id, compete_id) VALUES (3, 3, 3);