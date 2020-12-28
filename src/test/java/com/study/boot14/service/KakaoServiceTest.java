package com.study.boot14.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
public class KakaoServiceTest {


    @Autowired
    KakaoService kakaoService;

    /**
     * 버전 1.1.4 에서는 같은 리턴타입에 다른 recover 메소드 있으면 인자 비교시 에러 난다. 2.1.5에서 해결 (정확히 언제부터인지는 모르겠음)
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void 재시도_후_복구() {
        String result = "테스트";
        String token = kakaoService.getToken(result);
        log.info(token);
        assertThat(token).isEqualTo(result);
        String name = kakaoService.getUserName(1, 1);
        assertThat(name).isEqualTo("이름");

    }
}