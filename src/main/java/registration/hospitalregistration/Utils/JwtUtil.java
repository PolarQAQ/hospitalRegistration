package registration.hospitalregistration.Utils;

import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
//import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.Map;

public class JwtUtil {
    private static final long expire = 3600 * 100 * 24 * 36;
    private static final String signKey = "Young";

    public static String generateJwt(Map<String, Object> claims) {

        return Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, signKey)//使用的加密方式
                .setExpiration(new Date(System.currentTimeMillis() + expire))//截止日期
                .addClaims(claims)//传输的数据
                .compact();//转换成字符串
    }

    public static Claims parseJWT(String jwt) {
        return Jwts.parser()
                .setSigningKey(signKey)
                .parseClaimsJws(jwt)
                .getBody();
    }

}
