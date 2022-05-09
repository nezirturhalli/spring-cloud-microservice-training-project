CREATE KEYSPACE db_account
    WITH replication = {'class':'SimpleStrategy', 'replication_factor': 3};

CREATE TABLE db_account(
                            id text PRIMARY KEY ,
                            username text,
                            email text,
                            password text
);

select * from db_account