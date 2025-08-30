CREATE TABLE item_types
(
    id           bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,

    date_created timestamptz DEFAULT NOW()
);

CREATE TABLE items
(
    id           bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    date_created timestamptz DEFAULT NOW(),
    item_type    bigint REFERENCES item_types (id),
    deleted      boolean
);

CREATE TABLE links
(
    id           bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    date_created timestamptz DEFAULT NOW(),
    first        bigint REFERENCES items (id),
    second       bigint REFERENCES items (id),
    link_type    bigint REFERENCES items (id),
    deleted      boolean
);

CREATE TABLE item_translations
(
    id              bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    date_created    timestamptz DEFAULT NOW(),
    target_item     bigint REFERENCES items (id),
    translated_text text,
    language_code   text,
    deleted         boolean
);

CREATE TABLE tags
(
    id           bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    date_created timestamptz DEFAULT NOW(),
    tagged_item_id      bigint REFERENCES items (id),
    deleted      boolean,
    tag_key      text,
    tag_value    jsonb,
    tag_type     bigint REFERENCES item_types (id)
);