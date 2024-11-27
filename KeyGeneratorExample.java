import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class KeyGeneratorExample {
    public static void main(String[] args) throws Exception {
        // HMAC-SHA-256 알고리즘을 위한 256비트 비밀 키 생성
        KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256");
        keyGenerator.init(256); // 256비트 키 설정
        SecretKey secretKey = keyGenerator.generateKey();
        
        // 생성된 키를 Base64로 인코딩하여 환경 변수로 저장 가능하게 변환
        String base64EncodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
        
        // 생성된 Base64 인코딩된 비밀 키 출력 (환경 변수에 저장)
        System.out.println("Generated Secret Key (Base64): " + base64EncodedKey);
    }

    /* HOw TO USE */    
    // // 환경 변수에서 JWT 비밀 키 가져오기
    // private static final String SECRET_KEY_ENV = System.getenv("JWT_SECRET_KEY");
    
    // // Base64로 인코딩된 키를 디코드하여 SecretKey 객체로 변환
    // private static final SecretKey SECRET_KEY = Keys.hmacShaKeyFor(Base64.getDecoder().decode(SECRET_KEY_ENV));
}
