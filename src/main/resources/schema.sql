/* drop table authorities;
drop table user;

create table user(
  userName varchar_ignorecase(50) not null primary key,
  password varchar_ignorecase(50) not null,
  enabled boolean not null
);

create table authorities (
  userName varchar_ignorecase(50) not null,
  authority varchar_ignorecase(50) not null,
  constraint fk_authorities_users foreign key(userName) references user(userName)
);
create unique index ix_auth_username on authorities (userName,authority);
INSERT INTO user (userName,password, enabled) values ('user', 'pass', true );
INSERT INTO user (userName,password, enabled) values ('admin', 'pass', true );

INSERT INTO authorities (userName,authority) values ('user', 'ROLE_USER');
INSERT INTO authorities (userName,authority) values ('admin', 'ROLE_ADMIN');

*/