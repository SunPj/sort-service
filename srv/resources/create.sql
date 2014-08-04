--
-- PostgreSQL database dump
--

-- Dumped from database version 9.3.4
-- Dumped by pg_dump version 9.3.4
-- Started on 2014-08-04 08:39:40 YEKT

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 172 (class 3079 OID 11757)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 1953 (class 0 OID 0)
-- Dependencies: 172
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 171 (class 1259 OID 26618)
-- Name: authorities; Type: TABLE; Schema: public; Owner: ssuser; Tablespace: 
--

CREATE TABLE authorities (
  user_id integer NOT NULL,
  authority text
);


ALTER TABLE public.authorities OWNER TO ssuser;

--
-- TOC entry 170 (class 1259 OID 26610)
-- Name: users; Type: TABLE; Schema: public; Owner: ssuser; Tablespace: 
--

CREATE TABLE users (
  username text,
  password text,
  id integer NOT NULL,
  balance numeric(10,2),
  api_key character(32)
);


ALTER TABLE public.users OWNER TO ssuser;

--
-- TOC entry 1945 (class 0 OID 26618)
-- Dependencies: 171
-- Data for Name: authorities; Type: TABLE DATA; Schema: public; Owner: ssuser
--

COPY authorities (user_id, authority) FROM stdin;
1	ROLE_ADMIN
2	ROLE_USER
\.


--
-- TOC entry 1944 (class 0 OID 26610)
-- Dependencies: 170
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: ssuser
--

COPY users (username, password, id, balance, api_key) FROM stdin;
admin	123	1	0.00	\N
user	321	2	100.00	\N
\.


--
-- TOC entry 1835 (class 2606 OID 26625)
-- Name: uid; Type: CONSTRAINT; Schema: public; Owner: ssuser; Tablespace: 
--

ALTER TABLE ONLY authorities
ADD CONSTRAINT uid PRIMARY KEY (user_id);


--
-- TOC entry 1833 (class 2606 OID 26617)
-- Name: users_pkey; Type: CONSTRAINT; Schema: public; Owner: ssuser; Tablespace: 
--

ALTER TABLE ONLY users
ADD CONSTRAINT users_pkey PRIMARY KEY (id);


--
-- TOC entry 1836 (class 2606 OID 26626)
-- Name: fkpid; Type: FK CONSTRAINT; Schema: public; Owner: ssuser
--

ALTER TABLE ONLY authorities
ADD CONSTRAINT fkpid FOREIGN KEY (user_id) REFERENCES users(id);


--
-- TOC entry 1952 (class 0 OID 0)
-- Dependencies: 5
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2014-08-04 08:39:40 YEKT

--
-- PostgreSQL database dump complete
--

