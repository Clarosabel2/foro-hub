create table users(

                         id bigint not null auto_increment,
                         username varchar(100) not null unique,
                         email varchar(100) not null unique,
                         password varchar(100) not null,

                         primary key(id)
);