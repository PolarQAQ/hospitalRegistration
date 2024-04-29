package registration.hospitalregistration.Utils;

import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
//import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.Map;

public class JwtUtil {
    private static final long expire = 3600 * 100 * 24;
    private static final String signKey = "Young";

    public static String generateJwt(Map<String, Object> claims) {

        return Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, signKey)
                .setExpiration(new Date(System.currentTimeMillis() + expire))
                .addClaims(claims)
                .compact();
    }

    public static Claims parseJWT(String jwt) {
        return Jwts.parser()
                .setSigningKey(signKey)
                .parseClaimsJws(jwt)
                .getBody();
    }

}
