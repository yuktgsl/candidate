CREATE TABLE IF NOT EXISTS candidates.candidate
(
    user_id bigint NOT NULL,
    phone_number character varying(50),
    email_address character varying(255) NOT NULL,
    name character varying(255) NOT NULL,
    user_name character varying(255) NOT NULL,
    website_url character varying(255) ,
    
    CONSTRAINT candidate_pkey PRIMARY KEY (user_id),
    CONSTRAINT candidate_email_address_key UNIQUE (email_address),
    CONSTRAINT candidate_name_key UNIQUE (name),
    CONSTRAINT candidate_user_name_key UNIQUE (user_name)
)
