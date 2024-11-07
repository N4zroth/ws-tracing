package com.github.n4zroth.ws_tracing;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;

import lombok.RequiredArgsConstructor;

@Profile("wstest")
@Configuration
@RequiredArgsConstructor
public class WsConfig extends WsConfigurerAdapter {
    private final FeignClientExample feignClientExample;
}
