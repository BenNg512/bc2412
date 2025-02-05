create database bootcamp_exercise4;
use bootcamp_exercise4;

create table players(
	player_id int not null unique,
	group_id int not null
);

create table matches(
	match_id integer not null unique,
    first_player integer not null,
    second_player integer not null,
    first_score integer not null,
    second_score integer not null
);