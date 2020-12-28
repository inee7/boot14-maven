package com.study.boot14.config;

import com.study.boot14.service.KakaoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class KakaoConfig {

    @Bean
    public KakaoService kakaoService() {
        return () -> "test";
    }
}
