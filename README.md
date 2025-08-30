

# Local Setup 

## Database

CREATE USER character_inventory WITH PASSWORD 'character_inventory_password' SUPERUSER;
CREATE USER item_inventory WITH PASSWORD 'item_inventory_password SUPERUSER';


# Roadmap

- Build and series add/edit service

ability to crud series
ability to add character to series
ability to add character to series

- Roll Service
  Allow 7 rolls
  Must return none if all fail.
# Ideas

- There is a daily weekly and monthly pool of series, users can roll in a specific pool or roll of rall chara

- pools
  weekly
  total

- filters
  male anime/game/all
  female anime/game/all


- you get badges based on tags of character

5 protagonist characters result in a

- characters points and rerolls

Characters are worth points
You can dissolve characters to gain %50 of their value as points
1000 Points allows you to make an enhanced roll which will have a higher chance of giving you characters from a wishlisted series.
- Sets



- Characters photos can be autoset.
  If you choose a specific photo for their main photo youll choose


# Data Transfer

- Character Backup
  Contains series and character metadata
  .cdata
- Character Assets
  .cassets

# Services
## character management service

Should be a website and standalone app which can either load the data transfer files or load

- crud series
- crud character
- merge series
- delete series



## Roll Services

- roll(filters )

### Admin Features

- change series enabled for server

# Tables

## Item
ID
DATE_ADDED

## Link 
ID
SOURCE_ID
DESTINATION_ID
LINK_TYPE_ID

## Link Types
ID

## Item Translation
ID
TEXT
LANGUAGE





## Character 
ID
SERIES_ID
TRANSLATION_ID
Gender
Type

## Series

ID
NAME


## Names

ID
PRIMARY BOOLEAN #
LANGAGE_CODE


## Tags

ID
NAME
VALUE

## Rolls

DATETIME
ACCOUNTID


CHARACTER AUDIT



# Last