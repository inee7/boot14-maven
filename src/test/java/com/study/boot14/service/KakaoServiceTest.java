package com.study.boot14.service;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
public class KakaoServiceTest {


    @Autowired
    KakaoService kakaoServiceException;

    @Test
    public void 재시도_후_복구() {
        String token = kakaoServiceException.getToken();
        log.info(token);
        Assertions.assertThat(token).isEqualTo("복구됨");
    }
}