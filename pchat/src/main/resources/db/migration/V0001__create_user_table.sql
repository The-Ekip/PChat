CREATE TABLE user
(
    user_id      bigint NOT NULL AUTO_INCREMENT,
    first_name  varchar(255) DEFAULT NULL,
    last_name  varchar(255) DEFAULT NULL,
    mail  varchar(255) DEFAULT NULL,
    gender  varchar(255) DEFAULT NULL,
    `password`  varchar(255) DEFAULT NULL,
    phone  varchar(255) DEFAULT NULL,
    `rank` varchar(255) DEFAULT NULL,
    `role` varchar(255) DEFAULT NULL,
    user_status varchar(255) DEFAULT NULL,
    nick_name varchar(255) DEFAULT NULL,
    created_at   datetime(6) DEFAULT NULL,
    PRIMARY KEY (user_id)
)
