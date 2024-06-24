CREATE TABLE IF NOT EXISTS candidates.company
(
    user_id bigint NOT NULL,
    bs character varying(255) NOT NULL,
    catch_phrase character varying(255) NOT NULL,
    name character varying(255) NOT NULL,
    CONSTRAINT company_pkey PRIMARY KEY (user_id)
)
