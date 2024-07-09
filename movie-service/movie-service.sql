CREATE SCHEMA `movie-service`;

CREATE TABLE `movie-service`.`people`
(
    `id`            BIGINT       NOT NULL AUTO_INCREMENT,
    `code`          VARCHAR(45)  NOT NULL,
    `name`          VARCHAR(45)  NOT NULL,
    `image`         VARCHAR(145) NOT NULL,
    `gender`        INT          NOT NULL,
    `biography`     VARCHAR(345) NOT NULL,
    `date_of_birth` DATE         NOT NULL,
    `status`        INT          NOT NULL,
    `created_time`  DATETIME     NOT NULL default NOW(),
    `created_by`    VARCHAR(45)  NOT NULL,
    `updated_time`  DATETIME NULL,
    `updated_by`    VARCHAR(45) NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
    UNIQUE INDEX `code_UNIQUE` (`code` ASC) VISIBLE
);


CREATE TABLE `movie-service`.`genre`
(
    `id`           BIGINT      NOT NULL AUTO_INCREMENT,
    `code`         VARCHAR(45) NOT NULL,
    `name`         VARCHAR(45) NOT NULL,
    `created_time` DATETIME    NOT NULL default NOW(),
    `created_by`   VARCHAR(45) NOT NULL,
    `updated_time` DATETIME NULL,
    `updated_by`   VARCHAR(45) NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
    UNIQUE INDEX `code_UNIQUE` (`code` ASC) VISIBLE
);

CREATE TABLE `movie-service`.`movie`
(
    `id`              BIGINT       NOT NULL AUTO_INCREMENT,
    `code`            VARCHAR(45)  NOT NULL,
    `title`           VARCHAR(45)  NOT NULL,
    `poster`          VARCHAR(145) NOT NULL,
    `trailer`         VARCHAR(145) NOT NULL,
    `age_restriction` INT          NOT NULL,
    `duration`        INT          NOT NULL,
    `status`          INT          NOT NULL,
    `release_date`    DATE         NOT NULL,
    `created_time`    DATETIME     NOT NULL default NOW(),
    `created_By`      VARCHAR(45)  NOT NULL,
    `updated_time`    DATETIME NULL,
    `updated_by`      VARCHAR(45) NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE
);



CREATE TABLE `movie-service`.`movie_genre`
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
            REFERENCES `movie-service`.`genre` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `FK_MG_M`
        FOREIGN KEY (`id_movie`)
            REFERENCES `movie-service`.`movie` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
);

CREATE TABLE `movie-service`.`movie_role`
(
    `id`           BIGINT      NOT NULL AUTO_INCREMENT,
    `id_movie`     BIGINT      NOT NULL,
    `id_people`    BIGINT      NOT NULL,
    `role`         INT         NOT NULL,
    `created_time` DATETIME    NOT NULL default NOW(),
    `created_By`   VARCHAR(45) NOT NULL,
    `updated_time` DATETIME NULL,
    `updated_by`   VARCHAR(45) NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
    INDEX          `FK_MORO_MOVIE_idx` (`id_movie` ASC) VISIBLE,
    INDEX          `FK_MORO_PEOPLE_idx` (`id_people` ASC) VISIBLE,
    CONSTRAINT `FK_MORO_MOVIE`
        FOREIGN KEY (`id_movie`)
            REFERENCES `movie-service`.`movie` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `FK_MORO_PEOPLE`
        FOREIGN KEY (`id_people`)
            REFERENCES `movie-service`.`people` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
);
