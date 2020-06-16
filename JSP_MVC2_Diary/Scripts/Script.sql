DROP TABLE USERS;
--private String user_uid;
--	private String user_avartar;
--	private String user_name;
--	private String user_email;
--	private String user_pw;

CREATE TABLE "USERS"(
	USER_UID VARCHAR2(20),
	USER_AVARTAR VARCHAR2(200),
	USER_NAME VARCHAR2(50),
	USER_EMAIL VARCHAR2(100),
	USER_PW VARCHAR2(200),
	IS_ACTIVE CHAR(1),
	IS_ADMIN CHAR(1)
);

SELECT * FROM "USERS";