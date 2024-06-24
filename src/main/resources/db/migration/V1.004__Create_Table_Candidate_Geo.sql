CREATE TABLE IF NOT EXISTS candidates.geo
(
    user_id bigint NOT NULL,
    lat character varying(255),
    lng character varying(255),

    CONSTRAINT geo_pkey PRIMARY KEY (user_id)
)
