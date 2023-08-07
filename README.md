## API vs gRPC 성능 비교

- 둘 다 node js와 spring boot 사용.
- gRPC는 철저히 '민덕이네 개발노트'의 민덕이님의 코드를 빌려서 사용했다. [출처 : 민덕이네 개발노트](https://minddong.tistory.com/71)

## 성능 분석 방법
- client인 node js의 console.time()과 console.timeEnd()을 사용했다.

## 성능분석결과
||10번|100번|1000번|
|---|---|---|---|
|gRPC|4.348ms|12.593ms|82.52ms|
|API|53.147ms|78.054ms|391.473ms|

## 확인할 수 있는 것
- API보다 gRPC가 성능적으로 빠르다.
