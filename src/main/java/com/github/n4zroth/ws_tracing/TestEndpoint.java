package com.github.n4zroth.ws_tracing;

import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestEndpoint {

    @GetMapping("/test")
    public String test() {
        log.info("test");
        return MDC.get("spanId");
    }
}
