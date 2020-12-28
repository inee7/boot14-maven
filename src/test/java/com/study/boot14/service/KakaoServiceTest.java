package com.study.boot14.service;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

@Slf4j
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
public class KakaoServiceTest {


    @Autowired
    KakaoService kakaoServiceException;

    @Test
    public void 재시도_후_복구() {
        String result = "테스트";
        String token = kakaoServiceException.getToken(result);
        log.info(token);
        assertThat(token).isEqualTo(result);
    }
}