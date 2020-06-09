create table person
(
    id        bigserial not null
        constraint idx_16448_primary
            primary key,
    version   integer default 0,
    firstname text      not null,
    lastname  text      not null
);

