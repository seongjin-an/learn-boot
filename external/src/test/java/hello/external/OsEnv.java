package hello.external;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class OsEnv {
    public static void main(String[] args) {
        Map<String, String> getenv = System.getenv();
        for (String key : getenv.keySet()) {
            log.info("env {}={}", key, System.getenv(key));
        }
        // DB URL= dev.db.com 개발서버
        // DB URL = prod.db.com 운영서버
        // System.getenv("DBURL");
    }
}
