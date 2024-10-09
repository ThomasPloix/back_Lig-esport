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

INSERT INTO regions (id, name, description, logo) VALUES (1, 'LEC', 'League of Legends Champions Korea', 'https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/League_of_Legends_EMEA_Championship.png/330px-League_of_Legends_EMEA_Championship.png');
INSERT INTO regions (id, name, description, logo) VALUES (2, 'LCK', 'League of Legends EMEA Championship, Europe', 'https://upload.wikimedia.org/wikipedia/commons/thumb/1/13/League_of_Legends_Champions_Korea_logo.svg/330px-League_of_Legends_Champions_Korea_logo.svg.png');
INSERT INTO regions (id, name, description, logo) VALUES (3, 'LPL', 'League of Legends Pro League, Chine', 'https://upload.wikimedia.org/wikipedia/en/thumb/b/b4/League_of_legends_pro_league_logo.svg/330px-League_of_legends_pro_league_logo.svg.png');
INSERT INTO regions (id, name, description, logo) VALUES (4, 'LCS', 'League Championship Series, Amérique', 'https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/League_championship_series_logo_2021.svg/375px-League_championship_series_logo_2021.svg.png');

INSERT INTO competes (id, name, region_id) VALUES (1, 'LEC SUMMER 2024', 1);
INSERT INTO competes (id, name, region_id) VALUES (2, 'LCK SUMMER 2024', 2);
INSERT INTO competes (id, name, region_id) VALUES (3, 'LCS SUMMER 2024', 4);

INSERT INTO teams (id, name, description, logo, date_created, lieu, partners, region_id) VALUES (1, 'G2', 'Le sang', 'https://upload.wikimedia.org/wikipedia/fr/thumb/e/e4/G2_Esports.svg/langfr-800px-G2_Esports.svg.png', '2021-01-01', 'Berlin', 'Microsoft, Google', 1);
INSERT INTO teams (id, name, description, logo, date_created, lieu, partners, region_id) VALUES (2, 'T1', 'La sueur', 'https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/T1_esports_logo.svg/640px-T1_esports_logo.svg.png', '2021-01-01', 'Séoul', 'Samsung, LG', 2);
INSERT INTO teams (id, name, description, logo, date_created, lieu, partners, region_id) VALUES (3, 'Cloud9', 'Les larmes', 'https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/Cloud9_logo_c._2023.svg/640px-Cloud9_logo_c._2023.svg.png', '2021-01-01', 'Los Angeles', 'Apple, Amazon', 4);
INSERT INTO teams (id, name, description, logo, date_created, lieu, partners, region_id) VALUES (4, 'Fnatic', 'Le coeur', 'https://upload.wikimedia.org/wikipedia/fr/thumb/f/f4/Fnatic-Logo-2020.svg/langfr-1280px-Fnatic-Logo-2020.svg.png', '2021-01-01', 'Londres', 'Facebook, Twitter', 1);
INSERT INTO teams (id, name, description, logo, date_created, lieu, partners, region_id) VALUES (5, 'TSM', 'Le sang', 'https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/TSM_Logo.svg/langfr-390px-TSM_Logo.svg.png', '2021-01-01', 'Los Angeles', 'Microsoft, Google', 4);
INSERT INTO teams (id, name, description, logo, date_created, lieu, partners, region_id) VALUES (6, 'Rogue', 'La sueur', 'https://upload.wikimedia.org/wikipedia/fr/thumb/7/7c/Rogue_Primary_Logo_v1.png/390px-Rogue_Primary_Logo_v1.png', '2021-01-01', 'Séoul', 'Samsung, LG', 1);
INSERT INTO teams (id, name, description, logo, date_created, lieu, partners, region_id) VALUES (7, '100 Thieves', 'Les larmes', 'https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/100_Thieves_logo.svg/330px-100_Thieves_logo.svg.png', '2021-01-01', 'Los Angeles', 'Apple, Amazon', 4);


INSERT INTO players (id, first_name, last_name, pseudo, team_id, image) VALUES (1, 'Rasmus', 'Winther', 'Caps', 1, 'https://commons.wikimedia.org/wiki/File:Caps_G2_2020_(1).jpg?uselang=fr');
INSERT INTO players (id, first_name, last_name, pseudo, team_id, image) VALUES (2, 'Martin', 'Larsson', 'Rekkles', 1, 'https://commons.wikimedia.org/wiki/File:Rekkles_G2_2021.jpg?uselang=fr');
INSERT INTO players (id, first_name, last_name, pseudo, team_id, image) VALUES (3, 'Ryu', 'Min-seok', 'Keria', 2, 'https://commons.wikimedia.org/wiki/File:Keria_T1_2021.jpg?uselang=fr');
INSERT INTO players (id, first_name, last_name, pseudo, team_id, image) VALUES (4, 'Lee', 'Sang-hyeok', 'Faker', 2, 'https://commons.wikimedia.org/wiki/File:Faker_T1_2021.jpg?uselang=fr');
Insert Into players (id, first_name, last_name, pseudo, team_id, image) VALUES (5, 'Yasin', 'Dinçer', 'Nisqy', 3, 'https://commons.wikimedia.org/wiki/File:Nisqy_Cloud9_2021.jpg?uselang=fr');

INSERT INTO team_compete (id, team_id, compete_id) VALUES (1, 1, 1);
INSERT INTO team_compete (id, team_id, compete_id) VALUES (2, 2, 2);
INSERT INTO team_compete (id, team_id, compete_id) VALUES (3, 3, 3);

INSERT INTO matchs (id, date, team1_id, team2_id, result, score, compete_id, joueur_id) VALUES (1, '2024-08-01', 3, 2, false, '23-6', 1, 3);