package com.study.boot14.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
public class KakaoServiceTest {

    @Value("name")
    private String name;

    @Autowired
    KakaoService kakaoService;

    @Test
    public void name() {
        log.info(name);

        log.info(kakaoService.getToken());


    }
}