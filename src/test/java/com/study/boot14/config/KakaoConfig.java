package com.study.boot14.config;

import com.study.boot14.service.KakaoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Slf4j
@Profile("test")
@Configuration
public class KakaoConfig {

    @Bean
    public KakaoService kakaoServiceException() {
        return new KakaoService() {
            @Override
            public String getToken() {
                log.info("call getToken");
                throw new RuntimeException("getToken시 에러");
//            return "test";
            }

            @Override
            public String recover(Exception exception) {
                log.info("call recover");

                return "복구됨";
            }
        };
    }
}
