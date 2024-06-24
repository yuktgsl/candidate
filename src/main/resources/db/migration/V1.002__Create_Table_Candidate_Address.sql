CREATE TABLE IF NOT EXISTS candidates.address
(
    user_id bigint NOT NULL,
    city character varying(255) ,
    street character varying(255)  NOT NULL,
    suite character varying(255) ,
    zipcode character varying(255)  NOT NULL,
    
    CONSTRAINT address_pkey PRIMARY KEY (user_id),
    CONSTRAINT address_city_key UNIQUE (city),
    CONSTRAINT address_suite_key UNIQUE (suite),

    CONSTRAINT address_zipcode_key UNIQUE (zipcode)
)
