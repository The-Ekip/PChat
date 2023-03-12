CREATE TABLE room
(
    room_id      bigint NOT NULL AUTO_INCREMENT,
    created_at   datetime(6) DEFAULT NULL,
    max_capacity int          DEFAULT NULL,
    room_status  varchar(255) DEFAULT NULL,
    room_type    smallint     DEFAULT NULL,
    PRIMARY KEY (room_id)
)
