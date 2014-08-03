-- Table: users

-- DROP TABLE users;

CREATE TABLE users
(
  username text,
  password text,
  id integer NOT NULL,
  CONSTRAINT users_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE users
  OWNER TO kraken;

-- Table: authorities

-- DROP TABLE authorities;

CREATE TABLE authorities
(
  user_id integer NOT NULL,
  authority text,
  CONSTRAINT authorities_pkey PRIMARY KEY (),
  CONSTRAINT authorities_user_id_fkey FOREIGN KEY ()
  REFERENCES users () MATCH SIMPLE
  ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
OIDS=FALSE
);
ALTER TABLE authorities
OWNER TO kraken;

