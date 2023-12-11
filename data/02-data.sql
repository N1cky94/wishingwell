insert into users (firstname) values
    ('Nick'),
    ('Kelly'),
    ('Fynn'),
    ('Ivy'),
    ('Lilly')
;

insert into authentication_users
(email, password, user_id, role) values
    ('nick@me.com', '$2a$12$5qkEsAkQ2aFA/dWNnh61x.jbw38NeeC6SqyncHzRYnZBwOMixpfQ6', 1, 'ADMIN'),
    ('kelly@me.com', '$2a$12$5qkEsAkQ2aFA/dWNnh61x.jbw38NeeC6SqyncHzRYnZBwOMixpfQ6', 2, 'USER')
;