# 🐿 소소마켓


## 📂 프로젝트 소개

**소소마켓**(회원간 굿즈 거래 및 경매 시스템)

> 많은 중고거래가 이루어지지만 시세에 따른 가격 변동이 있는만큼 가격 제시를 받는 경우가 많다.
'소소마켓'은 이러한 소소한 상품을 일반적으로 판매할 수 있는 기능 뿐만이 아니라 경매 기능을 제공한다.

- 경매 기능 제공 : 가격을 정확히 측정하기 어려운 상품을 경매를 통해 거래를 가능케 한다.
- 입찰 기능 제공 : 구매자가 원하는 가격으로 입찰할 수 있다.
- 부담되지 않는 가격 : 소소한 상품을 거래하는 플랫폼이기에 기존 경매 플랫폼과는 차별화된다.


## 📆 개발 기간
2022.3.8 Tue ~ 2022.6.23 Thu


![image](https://user-images.githubusercontent.com/70093771/213378648-9f7df8f4-df0e-4425-b03b-c92ea2635445.png)


## ⚙️ 개발 환경 및 기술
#### 개발 환경
- Oracle SQL Developer, Eclipse, Tomcat, ERwin
- Github


#### 사용 기술
- Java, JSP, CSS, HTML, JS
- SQL, Spring Framework, MyBatis

## 👥 멤버 구성
- 오윤아(Front-End)
- 고지수(Back-End)
- 김경원(Back-End)
- 이희원(Back-End)


## 📌 주요 기능
1. 일반/경매 상품 CRUD
	- 삭제 시 철회횟수 +1(신용도)
	- 마감기한 이후 최고가로 자동 낙찰
2. 입찰
	- 경매상품 현재가보다 높은 값만 입찰 가능
3. 사용자 CRUD & 로그인 
	- 회원 탈퇴 시 비밀번호 재입력
4. 주문 CR 
	- 구매/판매 나눠 확인가능 
5. 위시 CRD
	- 일반/경매 나눠 확인가능
6. 기타
	- 검색 (카테고리, 키워드)

## 시스템 구성도
![image](https://user-images.githubusercontent.com/70093771/213385313-bd076b3c-e26d-409c-9aa6-90fb9548bc31.png)

![image](https://user-images.githubusercontent.com/70093771/213385370-9b875ab4-dfb5-46e1-b129-61f5500348c9.png)

## DB 설계
![image](https://user-images.githubusercontent.com/70093771/213385632-d9c0f6fc-2b40-40c1-a60e-408b2e148b0d.png)

<!--

## 구현 결과

- 메인

![image](https://user-images.githubusercontent.com/70093771/213373637-206c72fd-ced8-4aaa-baa1-3b49bcf49b1c.png)

---




<!-- # SoSoMarket

Test용 ID/PW
ID: 20190936
PW: 20190936 -->

