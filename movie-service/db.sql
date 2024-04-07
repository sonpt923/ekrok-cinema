CREATE SCHEMA `movie`;

CREATE TABLE `movie`.`directors`
(
    `id`           BIGINT       NOT NULL AUTO_INCREMENT,
    `name`         VARCHAR(145) NOT NULL,
    `status`       VARCHAR(45)  NOT NULL,
    `created_by`   VARCHAR(45)  NOT NULL,
    `created_time` DATETIME     NOT NULL default NOW(),
    `updated_by`   VARCHAR(45) NULL,
    `updated_time` DATETIME NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `movie`.`movie`
(
    `id`            BIGINT      NOT NULL AUTO_INCREMENT,
    `id_director`   BIGINT      NOT NULL,
    `name`          VARCHAR(45) NOT NULL,
    `age`           VARCHAR(45) NOT NULL,
    `time`          DATETIME    NOT NULL,
    `status`        BIGINT      NOT NULL,
    `created_time`  DATETIME    NOT NULL default NOW(),
    `created_by`    VARCHAR(45) NOT NULL,
    `updated_time`  DATETIME NULL,
    `updated_by`    VARCHAR(45) NULL,
    `premiere_date` DATE        NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE,
    INDEX           `FK_M_D_idx` (`id_director` ASC) VISIBLE,
    CONSTRAINT `FK_M_D`
        FOREIGN KEY (`id_director`)
            REFERENCES `movie`.`directors` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
);

CREATE TABLE `movie`.`genre`
(
    `id`           BIGINT      NOT NULL AUTO_INCREMENT,
    `name`         VARCHAR(45) NOT NULL,
    `status`       VARCHAR(45) NOT NULL,
    `created_time` DATETIME    NOT NULL default NOW(),
    `created_by`   VARCHAR(45) NOT NULL,
    `updated_time` DATETIME NULL,
    `updated_by`   VARCHAR(45) NULL,
    PRIMARY KEY (`id`)
);


CREATE TABLE `movie`.`actor`
(
    `id`           BIGINT      NOT NULL AUTO_INCREMENT,
    `name`         VARCHAR(45) NOT NULL,
    `status`       VARCHAR(45) NOT NULL,
    `created_time` DATETIME    NOT NULL default NOW(),
    `created_by`   VARCHAR(45) NOT NULL,
    `updated_time` DATETIME NULL,
    `updated_by`   VARCHAR(45) NULL,
    PRIMARY KEY (`id`)
);


CREATE TABLE `movie`.`producer`
(
    `id`           BIGINT      NOT NULL AUTO_INCREMENT,
    `name`         VARCHAR(45) NOT NULL,
    `status`       VARCHAR(45) NOT NULL,
    `created_time` DATETIME    NOT NULL default NOW(),
    `created_by`   VARCHAR(45) NOT NULL,
    `updated_time` DATETIME NULL,
    `updated_by`   VARCHAR(45) NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `movie`.`movie_actor`
(
    `id`       BIGINT NOT NULL AUTO_INCREMENT,
    `id_movie` BIGINT NOT NULL,
    `id_actor` BIGINT NOT NULL,
    PRIMARY KEY (`id`),
    INDEX      `FK_M_A_idx` (`id_actor` ASC) VISIBLE,
    INDEX      `FK_MA_M_idx` (`id_movie` ASC) VISIBLE,
    CONSTRAINT `FK_MA_A`
        FOREIGN KEY (`id_actor`)
            REFERENCES `movie`.`actor` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `FK_MA_M`
        FOREIGN KEY (`id_movie`)
            REFERENCES `movie`.`movie` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
);

CREATE TABLE `movie`.`movie_producer`
(
    `id`          BIGINT NOT NULL AUTO_INCREMENT,
    `id_producer` BIGINT NOT NULL,
    `id_movie`    BIGINT NOT NULL,
    PRIMARY KEY (`id`),
    INDEX         `FK_PM_M_idx` (`id_movie` ASC) VISIBLE,
    INDEX         `FK_PM_P_idx` (`id_producer` ASC) VISIBLE,
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
    CONSTRAINT `FK_PM_P`
        FOREIGN KEY (`id_producer`)
            REFERENCES `movie`.`producer` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `FK_PM_M`
        FOREIGN KEY (`id_movie`)
            REFERENCES `movie`.`movie` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
);

CREATE TABLE `movie`.`movie_genre`
(
    `id`       BIGINT NOT NULL AUTO_INCREMENT,
    `id_movie` BIGINT NOT NULL,
    `id_genre` BIGINT NOT NULL,
    PRIMARY KEY (`id`),
    INDEX      `FK_MG_G_idx` (`id_genre` ASC) VISIBLE,
    INDEX      `FK_MG_M_idx` (`id_movie` ASC) VISIBLE,
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
    CONSTRAINT `FK_MG_G`
        FOREIGN KEY (`id_genre`)
            REFERENCES `movie`.`genre` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `FK_MG_M`
        FOREIGN KEY (`id_movie`)
            REFERENCES `movie`.`movie` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
);

