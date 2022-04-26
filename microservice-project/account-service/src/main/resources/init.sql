CREATE KEYSPACE springcloud
    WITH replication = {'class':'SimpleStrategy', 'replication_factor': 3};

CREATE TABLE springcloud(
                            id text PRIMARY KEY ,
                            username text,
                            email text,
                            password text
);

select * from springcloud