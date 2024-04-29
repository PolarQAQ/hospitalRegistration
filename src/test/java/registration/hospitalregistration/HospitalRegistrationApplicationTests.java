package registration.hospitalregistration;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class HospitalRegistrationApplicationTests {

//    @Test
//    public void testJWT() {
//        Map<String, Object> claims = new HashMap<>();
//        claims.put("id", 1);
//        claims.put("name", "tom");
//        String jwt = Jwts.builder()
//                .signWith(SignatureAlgorithm.HS256, "yang")//签名算法
//                .setClaims(claims)//自定义内容（荷载）(数据)
//                .setExpiration(new Date(System.currentTimeMillis() + 3600 * 1000))//设置有效时间
//                .compact();
//        System.out.println(jwt);
//    }

//    @Test
//    public void testDecode() {
//        Claims claims = Jwts.parser()
//                .setSigningKey("yang")
//                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoidG9tIiwiaWQiOjEsImV4cCI6MTcxNDM3NzE4Nn0.mnpLtD5WgwOVNKhPRXyvxbES023Eyro93S6w1nPbnpw")
//                .getBody();
//        System.out.println(claims);
//    }

}
