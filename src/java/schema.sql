DROP TABLE IF EXISTS relationship CASCADE
;

DROP TABLE IF EXISTS search_index CASCADE
;

DROP TABLE IF EXISTS usage_assoc_ip_object CASCADE
;

DROP TABLE IF EXISTS usage_search_log CASCADE
;

DROP TABLE IF EXISTS usage_ip_log CASCADE
;

DROP TABLE IF EXISTS attribute CASCADE
;

DROP TABLE IF EXISTS usage_assoc_ip_search CASCADE
;

DROP TABLE IF EXISTS object CASCADE
;

CREATE TABLE object (ID BIGINT NOT NULL AUTO_INCREMENT, NAME LONGTEXT NULL, PRIMARY KEY (ID))
;

CREATE TABLE usage_assoc_ip_search (ID BIGINT NOT NULL, IP_ID BIGINT NOT NULL, SEARCH_ID BIGINT NOT NULL, PRIMARY KEY (ID))
;

CREATE TABLE attribute (ID BIGINT NOT NULL AUTO_INCREMENT, NAME LONGTEXT NULL, PRIMARY KEY (ID))
;

CREATE TABLE usage_ip_log (ID BIGINT NOT NULL, IP_ADDRESS LONGTEXT NULL, PRIMARY KEY (ID))
;

CREATE TABLE usage_search_log (ID BIGINT NOT NULL, SEARCH_TEXT LONGTEXT NOT NULL, PRIMARY KEY (ID))
;

CREATE TABLE usage_assoc_ip_object (ID BIGINT NOT NULL, IP_ID BIGINT NOT NULL, OBJECT_ID BIGINT NOT NULL, PRIMARY KEY (ID))
;

CREATE TABLE search_index (COMBINED_ATTRIBUTES LONGTEXT NOT NULL, ID BIGINT NOT NULL, OBJECT_NAME LONGTEXT NOT NULL, PERSPECTIVE LONGTEXT NULL, RANK BIGINT NOT NULL, WEIGHT BIGINT NOT NULL, PRIMARY KEY (ID))
;

CREATE TABLE relationship (ATTRIBUTE_ID BIGINT NOT NULL, ID BIGINT NOT NULL AUTO_INCREMENT, OBJECT_ID BIGINT NOT NULL, REFERENCE BIGINT NULL, VALUE LONGTEXT NULL, PRIMARY KEY (ID))
;

DROP TABLE IF EXISTS AUTO_PK_SUPPORT
;

CREATE TABLE AUTO_PK_SUPPORT (  TABLE_NAME CHAR(100) NOT NULL,  NEXT_ID INTEGER NOT NULL, UNIQUE (TABLE_NAME))
;

DELETE FROM AUTO_PK_SUPPORT WHERE TABLE_NAME IN ('attribute', 'object', 'relationship', 'search_index', 'usage_assoc_ip_object', 'usage_assoc_ip_search', 'usage_ip_log', 'usage_search_log')
;

INSERT INTO AUTO_PK_SUPPORT (TABLE_NAME, NEXT_ID) VALUES ('attribute', 200)
;

INSERT INTO AUTO_PK_SUPPORT (TABLE_NAME, NEXT_ID) VALUES ('object', 200)
;

INSERT INTO AUTO_PK_SUPPORT (TABLE_NAME, NEXT_ID) VALUES ('relationship', 200)
;

INSERT INTO AUTO_PK_SUPPORT (TABLE_NAME, NEXT_ID) VALUES ('search_index', 200)
;

INSERT INTO AUTO_PK_SUPPORT (TABLE_NAME, NEXT_ID) VALUES ('usage_assoc_ip_object', 200)
;

INSERT INTO AUTO_PK_SUPPORT (TABLE_NAME, NEXT_ID) VALUES ('usage_assoc_ip_search', 200)
;

INSERT INTO AUTO_PK_SUPPORT (TABLE_NAME, NEXT_ID) VALUES ('usage_ip_log', 200)
;

INSERT INTO AUTO_PK_SUPPORT (TABLE_NAME, NEXT_ID) VALUES ('usage_search_log', 200)
;

