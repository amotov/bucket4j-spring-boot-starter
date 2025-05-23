package com.giffing.bucket4j.spring.boot.starter.filter.reactive.webflux;

import com.giffing.bucket4j.spring.boot.starter.context.properties.FilterConfiguration;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;

public interface WebfluxRateLimiterFilterFactory {

    WebfluxRateLimiterFilter create(
            FilterConfiguration<ServerHttpRequest, ServerHttpResponse> filterConfig);

}
