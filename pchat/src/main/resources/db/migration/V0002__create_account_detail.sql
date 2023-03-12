CREATE TABLE account_detail
(
    account_detail_id     bigint NOT NULL AUTO_INCREMENT,
    account_start_date    datetime(6)  DEFAULT NULL,
    account_status        varchar(255) DEFAULT NULL,
    account_type          varchar(255) DEFAULT NULL,
    account_type_deadline datetime(6)  DEFAULT NULL,
    PRIMARY KEY (account_detail_id)
)
