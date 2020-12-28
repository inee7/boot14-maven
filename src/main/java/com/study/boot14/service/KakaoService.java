package com.study.boot14.service;

import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;

public interface KakaoService {

    @Retryable(value = RuntimeException.class)
    String getToken(String arg);

    @Recover
    String recover(Exception exception, String arg);
}
