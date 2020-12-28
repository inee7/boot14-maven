package com.study.boot14.service;

import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;

public interface KakaoService {

    @Retryable(value = RuntimeException.class)
    String getToken(String arg);

    @Retryable
    String getUserName(int token, long id);

    @Recover
    String recover(Exception exception, String arg);

    @Recover
    String recover(Exception exception, int token, long id);
}
