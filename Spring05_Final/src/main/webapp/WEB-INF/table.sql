CREATE TABLE board_cafe(
	num NUMBER PRIMARY KEY,
	writer VARCHAR2(100) NOT NULL,
	title VARCHAR2(100) NOT NULL,
	content CLOB,
	viewCount NUMBER, --조회수
	regdate DATE
);

CREATE SEQUENCE board_cafe_seq;

CREATE TABLE board_cafe_comment(
	num Number PRIMARY KEY, 	-- 댓글의 글번호
	writer VARCHAR2(100),		-- 작성자의 아이디
	content VARCHAR2(500),		-- 댓글 내용
	target_id VARCHAR2(100),	-- 댓글 대상자 아이디
	ref_group NUMBER,			-- 게시글과 그 댓글 번호(한 게시물 +댓글)
	comment_group NUMBER,		-- 댓글과 그 댓글의 그룹번호(댓글 + 대댓글) num과 같으면 들여쓰기 다르면 들여쓰기 X
	deleted CHAR(3) DEFAULT 'no',
	regdate DATE
);

CREATE SEQUENCE board_cafe_comment_seq;

CREATE TABLE board_gallery(
	num NUMBER PRIMARY KEY,
	writer VARCHAR2(100),
	caption VARCHAR2(200),
	imagepath VARCHAR2(100),
	regdate DATE
);

CREATE SEQUENCE board_gallery_seq;

-- upload 된 파일의 정보를 저장할 테이블 
CREATE TABLE board_file(
	num NUMBER PRIMARY KEY,
	writer VARCHAR2(100) NOT NULL, 
	title VARCHAR2(100) NOT NULL,
	orgFileName VARCHAR2(100) NOT NULL, -- 원본 파일명
	saveFileName VARCHAR2(100) NOT NULL, -- 서버에 실제로 저장된 파일명
	fileSize NUMBER NOT NULL,
	regdate DATE
);

CREATE SEQUENCE board_file_seq;


-- 사용자(회원) 정보를 저장할 테이블 
CREATE TABLE users(
	id VARCHAR2(100) PRIMARY KEY,
	pwd VARCHAR2(100) NOT NULL,
	email VARCHAR2(100),
	profile VARCHAR2(100), -- 프로필 이미지 경로를 저장할 칼럼
	regdate DATE
);

