create table users (
    id int generated always as identity,
    name varchar(255) not null,
    primary key (id)
);

create table authentication_users (
    id int generated always as identity,
    email varchar(255) not null,
    password varchar(255) not null,
    user_id int not null,
    primary key (id),
    foreign key (user_id) references users(id)
);