package com.github.n4zroth.ws_tracing;

import feign.RequestLine;

public interface FeignClientExample {

    @RequestLine("GET /spring-projects/spring-ws/issues/1435")
    String getIssue();

}
