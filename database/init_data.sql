INSERT INTO item_types (text_id)
VALUES ('character');

INSERT INTO item_types (text_id)
VALUES ('series');

INSERT INTO item_types (text_id)
VALUES ('link');

INSERT INTO item_types (text_id)
VALUES ('tag');

ALTER TABLE items
ALTER COLUMN deleted TYPE BOOLEAN,
  ALTER COLUMN deleted SET NOT NULL,
  ALTER COLUMN deleted SET DEFAULT FALSE;

WITH new_item AS (
INSERT INTO items(item_type)
VALUES (1)
    RETURNING id
    )
INSERT INTO item_translations(target_item, translated_text, language_code)
SELECT id, 'Hello world Name', 'en' FROM new_item;
