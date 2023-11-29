CREATE DATABASE quarkussocial;

CREATE TABLE USER_TB (
        id bigserial not null primary key,
        name varchar (100) not null,
        age integer not null
);

CREATE TABLE POSTS_TB (
  id bigserial not null primary key,
  post_text varchar(150) not null,
  dateTime timestamp not null,
  user_id bigint not null references USER_TB(id)
);