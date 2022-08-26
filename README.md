<h1 align="center">WEanoDDING</h1>

### 목차

---

1. [프로젝트 소개](#-프로젝트-소개)
2. [사용스택](#사용스택)
3. [Project Period](#project-period)
4. [Constributors](#constributors)
5. [기능 상세](#기능-상세)

---

## 📖 프로젝트 소개

`WEanoDDING` 은 비대면 결혼식 참석 서비스 입니다.


📜 [노션]([https://ionized-sugar-931.notion.site/B-Noty-cf7e5b4f43754c178652ae2f23698852](https://www.notion.so/_-1ff8c6b9b3bd4252861787b404e733d4))

-   기획 내용
    - 결혼식 업체가 WEanoDDING 서비스에 예정된 결혼식 등록
    - Openvidu를 통해 신랑/신부측 화면 및 결혼식장 화면 공유
    - 제공된 URL 주소를 통해 하객들에게 비대면 결혼식 입장 가능(본인 인증, 축의금)
    - 결혼식 종료 후, 신랑/신부 측에 축의금 및 방명록 내용 전달
---

## 사용스택

| 용도      | 스택                                                                                                                                                                                                           | 버전  |
| --------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----- |
| 코드 편집 | <img src="https://img.shields.io/badge/Visual Studio Code-007ACC?style=plastic&logo=Visual Studio Code&logoColor=white">                                                                                       | v1.64 |
| 서버 설계         | <img src="https://img.shields.io/badge/Spring-339933?style=plastic&logo=Spring&logoColor=white"> | sts-3.9.14.RELEASE |
| 배포서버          | <img src="https://img.shields.io/badge/Amazon AWS-232F3E?style=plastic&logo=Amazon%20AWS&logoColor=white"> |        
| DB        | <img src="https://img.shields.io/badge/MySQL-FFCA28?style=plastic&logo=MySQL&logoColor=white">                                                                                                              |       |
| UI 개발           | <img src="https://img.shields.io/badge/Vue.js-4FC08D?style=plastic&logo=Vue.js&logoColor=white"> |                    |
| 형상관리  | <img src="https://img.shields.io/badge/git-F05032?style=plastic&logo=git&logoColor=white">                                                                                                                     |       |
| 협업      | <img src="https://img.shields.io/badge/Jira Software-0052CC?style=plastic&logo=Jira Software&logoColor=white"><img src="https://img.shields.io/badge/Notion-000000?style=plastic&logo=Notion&logoColor=white"> |       |

---

## Project Period

2022.07.05 - 2022.08.19 (7주)

---

## Constributors

| 팀원   | 역할                             | 비고 |
| ------ | -------------------------------- | ---- | 
| 최년우 | 팀장, 백 담당               |      | 
| 최지홍 | 백 담당                       |      |
| 손지민 | 백 담당                       |      |
| 유도경 | 백 담당                           |      |
| 석민형 | 프론트 담당                       |      |
| 배준식 | 프론트 담당                           |      |

---

## 기능 상세

-   결혼 업체의 회원가입, 로그인, 결혼식 관리

       ![login](https://user-images.githubusercontent.com/88392868/171982162-e68359c3-3ca6-49cb-9067-cd99f6b47940.gif)
    ▶ 업체의 회원 가입을 위해 아이디, 비밀번호, 업체 이름, 업체 번호 입력 

    ▶ JWT를 활요하여 비밀번호 암호화하여 데이터베이스에 저장

    ▶ 업체 로그인 시, 결혼식 일정에 맞춰 결혼식 예약 가능.
        
-   결혼식 예약 및 생성 화면

       <img src="exec/main.gif">
    ▶ 결혼식 예약을 위해 시간, 예식장 이름, 신랑 정보, 신부 정보, 결혼식 사진 업로드

    ▶ 결혼식 생성 완료 시 결혼식 시작, 상세 보기, 결혼식 종료 버튼 활성화

-   신랑/신부 대기방 화면. 결혼식장 화면

       ![search](https://user-images.githubusercontent.com/88392868/171982260-f6cb2834-5cca-407a-bfa8-c40091089f81.gif)
        ▶ 신랑/신부 대기방에 하객 입장 시, 대기열에 하객 정보 출력

    ▶ 받기 버튼 클릭 시, 대기방에 하객 입장. 내보내기 클릭 시, 하객 결혼식장 대기방으로 내보냄.

    ▶ 하객이 결혼식 장 입장 시, 결혼식을 볼 수 있는 화면과 실시간으로 채팅할 수 있는 기능 구현

-   하객 입장

       ![set](https://user-images.githubusercontent.com/88392868/171982282-86304238-e33f-4a6c-a843-323161172f71.gif)

    ▶ 제공된 URL에 접속한 하객은 본인 인증을 통해 결혼식 참여
    
    ▶ 본인 인증 완료 후, 소속과 방명록 작성
    
    ▶ 신랑/신부 대기방 입장 및 결혼식장 입장.

-   하객 놀이방 입장 화면

    ▶ 하객끼리 실시간으로 얼굴 보며 채팅 입력 가능
    
    ▶ 개인 메시지 기능 구현
-   결혼식 종료

    ▶ 결혼식 종료 시, 하객의 축의금 및 방명록 정보 출력
