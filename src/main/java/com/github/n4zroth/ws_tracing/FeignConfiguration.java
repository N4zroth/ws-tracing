package com.github.n4zroth.ws_tracing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Feign;
import feign.micrometer.DefaultFeignObservationConvention;
import feign.micrometer.MicrometerObservationCapability;
import io.micrometer.observation.ObservationRegistry;

@Configuration
public class FeignConfiguration {

    @Bean
    public FeignClientExample feignClientExample(final ObservationRegistry observationRegistry) {
        final Feign.Builder builder = Feign.builder()
                .addCapability(new MicrometerObservationCapability(observationRegistry,
                        DefaultFeignObservationConvention.INSTANCE));

        return builder.target(FeignClientExample.class, "http://www.github.com");
    }

}
