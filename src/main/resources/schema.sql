create table users(
  username varchar_ignorecase(50) not null primary key,
  password varchar_ignorecase(50) not null,
  enabled boolean not null
);

create table authorities (
  username varchar_ignorecase(50) not null,
  authority varchar_ignorecase(50) not null,
  constraint fk_authorities_users foreign key(username) references users(username)
);
create unique index ix_auth_username on authorities (username,authority);

INSERT INTO users (username,password, enabled) values ('anon', 'pass', true );
INSERT INTO users (username,password, enabled) values ('roman', 'pass', true );

INSERT INTO authorities (username,authority) values ('anon', 'USER_ROLES');
INSERT INTO authorities (username,authority) values ('roman', 'USER_ADMIN');