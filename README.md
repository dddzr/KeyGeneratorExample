# KeyGeneratorExample

HMAC-SHA-256 알고리즘을 위한 256비트 비밀 키 생성기, JWT 토큰 발급에 이용
(256 bit secret key generator for HMAC-SHA-256 algorithm, Use to make JWT tokens)

- 생성된 키는 환경 변수로 저장하여 사용하는 것을 권장함.
- key가 변경되면 이전에 발급한 JWT토큰은 모두 무효화됨.

코드 실행 방법
- vsCode: run Java
- 명령어
  javac KeyGeneratorExample.java
  java KeyGeneratorExample
