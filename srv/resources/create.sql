-- Role: ssuser

-- DROP ROLE ssuser;

CREATE ROLE ssuser LOGIN
NOSUPERUSER INHERIT NOCREATEDB NOCREATEROLE NOREPLICATION VALID UNTIL '2014-08-03 00:00:00';

-- Table: users

-- DROP TABLE users;

CREATE TABLE users
(
  username text,
  password text,
  id bigint NOT NULL,
  balance double precision,
  api_key character varying(32),
  CONSTRAINT upk PRIMARY KEY (id)
)
WITH (
OIDS=FALSE
);
ALTER TABLE users
OWNER TO ssuser;

-- Table: sort_request

-- DROP TABLE sort_request;

CREATE TABLE sort_request
(
  id integer NOT NULL,
  user_id bigint,
  sort_type integer,
  date date,
  "array" character varying,
  CONSTRAINT pk PRIMARY KEY (id),
  CONSTRAINT ufkr FOREIGN KEY (user_id)
  REFERENCES users (id) MATCH SIMPLE
  ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
OIDS=FALSE
);
ALTER TABLE sort_request
OWNER TO ssuser;

-- Table: authorities

-- DROP TABLE authorities;

CREATE TABLE authorities
(
  user_id integer NOT NULL,
  authority character varying(20),
  CONSTRAINT uid PRIMARY KEY (user_id)
)
WITH (
OIDS=FALSE
);
ALTER TABLE authorities
OWNER TO ssuser;
