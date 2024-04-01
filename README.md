# 📚코딩레시피 - [스프링부트(SpringBoot) 게시판 프로젝트]

# 개발환경
1. IDE: IntelliJ IDEA Community
2. Spring Boot 3.2.3
3. JDK 17
4. mysql
5. Spring Data JPA
6. Thymeleaf

# 게시판 주요기능 
1. 글쓰기(/board/write)
2. 글목록(/board/)
3. 글조회(/board/{id})
4. 글수정(/board/update/{id})
5. 글삭제(/board/delete/{id})



```
create table board_table
(
id             bigint auto_increment primary key,
created_time   datetime     null,
updated_time   datetime     null,
board_contents varchar(500) null,
board_hits     int          null,
board_pass     varchar(255) null,
board_title    varchar(255) null,
board_writer   varchar(20)  not null,
file_attached  int          null
);
```
