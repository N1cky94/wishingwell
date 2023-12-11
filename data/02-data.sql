insert into users (name) values
    ('Nick'),
    ('Kelly'),
    ('Fynn'),
    ('Ivy'),
    ('Lilly')
;

insert into authentication_users
(email, password, user_id, role) values
    ('nick@me.com', 'psw', 1, 'ADMIN'),
    ('kelly@me.com', 'psw', 2, 'USER')
: