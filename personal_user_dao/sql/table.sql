## 雪橇个人用户信息 ##
DROP TABLE IF EXISTS tpersonal_user;
CREATE TABLE tpersonal_user(
	FuserId BIGINT UNSIGNED NOT NULL,
	Ftel VARCHAR(64) NOT NULL DEFAULT "",
	Fpassword VARCHAR(64) NOT NULL DEFAULT "",
	Fcreate_timestamp BIGINT UNSIGNED NOT NULL DEFAULT 0,
	Flast_modify_timestamp BIGINT UNSIGNED NOT NULL DEFAULT 0,
	PRIMARY KEY(FuserId),
	UNIQUE KEY(Ftel)
) CHARSET=utf8mb4, ENGINE=InnoDb;

## 雪橇公司用户与个人用户的关联信息 ##
DROP TABLE IF EXISTS tuser_relate_info;
CREATE TABLE tuser_relate_info(
	Fpersonal_user_id BIGINT UNSIGNED NOT NULL DEFAULT 0,
	Fcompany_id BIGINT UNSIGNED NOT NULL DEFAULT 0,
	Fcompany_user_id BIGINT UNSIGNED NOT NULL DEFAULT 0,
	Fis_linked SMALLINT UNSIGNED NOT NULL DEFAULT 0,
	Fcreate_timestamp BIGINT UNSIGNED NOT NULL DEFAULT 0,
	Flast_modify_timestamp BIGINT UNSIGNED NOT NULL DEFAULT 0,
	PRIMARY KEY(Fpersonal_user_id)
) CHARSET=utf8mb4, ENGINE=InnoDb;

## 雪橇个人用户的收藏夹信息 ##
DROP TABLE IF EXISTS tfavorite_folder;
CREATE TABLE tfavorite_folder(
	Ffolder_id BIGINT UNSIGNED NOT NULL DEFAULT 0,
	Ffolder_name VARCHAR(128) NOT NULL DEFAULT "",
	Fparent_folder_id BIGINT UNSIGNED NOT NULL DEFAULT 0,
	Fpersonal_user_id BIGINT UNSIGNED NOT NULL DEFAULT 0,
	Fcreate_timestamp BIGINT UNSIGNED NOT NULL DEFAULT 0,
	Flast_modify_timestamp BIGINT UNSIGNED NOT NULL DEFAULT 0,
	PRIMARY KEY(Ffolder_id)
) CHARSET=utf8mb4, ENGINE=InnoDb;

## 雪橇个人用户的收藏图片信息 ##
DROP TABLE IF EXISTS tfavorite_chart;
CREATE TABLE tfavorite_chart(
	Ffavorite_chart_id BIGINT UNSIGNED NOT NULL,
	Fxiaoha_chart_id BIGINT UNSIGNED NOT NULL DEFAULT 0,
	Fparent_folder_id BIGINT UNSIGNED NOT NULL DEFAULT 0,
	Fpersonal_user_id BIGINT UNSIGNED NOT NULL DEFAULT 0,
	Fname VARCHAR(128) NOT NULL DEFAULT "",
	Fcreate_timestamp BIGINT UNSIGNED NOT NULL DEFAULT 0,
	Flast_modify_timestamp BIGINT UNSIGNED NOT NULL DEFAULT 0,
	PRIMARY KEY(Ffavorite_chart_id)
) CHARSET=utf8mb4, ENGINE=InnoDb;