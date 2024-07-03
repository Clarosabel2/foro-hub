create table topics(

                        id bigint not null auto_increment,
                        title varchar(100) not null unique,
                        message varchar(255) not null unique,
                        creationDate datetime not null,
                        status tinyint not null,
                        author_id bigint not null,
                        courses_id bigint not null,

                        primary key(id),

                        constraint fk_topicos_autor_topico_id foreign key(author_id) references users(id),
                        constraint fk_topicos_curso_id foreign key(courses_id) references courses(id)
);