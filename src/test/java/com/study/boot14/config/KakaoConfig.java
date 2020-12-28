package com.study.boot14.config;

import com.study.boot14.service.KakaoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Optional;

@Slf4j
@Profile("test")
@Configuration
public class KakaoConfig {

    @Bean
    public KakaoService kakaoServiceRetryRecover() {
        return new KakaoService() {
            @Override
            public String getToken(String arg) {
                log.info("call getToken");
                throw new RuntimeException("getToken시 에러");
//            return "test";
            }

            @Override
            public String getUserName(int token, long id) {
                log.info("call getUserName");
                throw new RuntimeException("getUserName시 에러");
            }

            @Override
            public String recover(Exception exception, String arg) {
                log.info("call recover getToken");

                return arg;
            }

            @Override
            public String recover(Exception exception, int token, long id) {
                log.info("call recover getUserName");

                return "이름";
            }
        };
    }

}
