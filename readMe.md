create table vehicles
(
id    int auto_increment
primary key,
name  varchar(64) null,
year  datetime    null,
price double      null
)
charset = utf8 engine = InnoDB;

create table maintenance
(
id        int auto_increment
primary key,
vehicleId int      null,
date      datetime null
)
charset = utf8 engine = InnoDB;
