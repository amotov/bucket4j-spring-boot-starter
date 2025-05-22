package com.giffing.bucket4j.spring.boot.starter.filter.reactive.factory;

import com.giffing.bucket4j.spring.boot.starter.context.properties.FilterConfiguration;
import com.giffing.bucket4j.spring.boot.starter.filter.reactive.webflux.WebfluxWebFilter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;

public interface WebfluxWebFilterFactory {

    WebfluxWebFilter create(
            FilterConfiguration<ServerHttpRequest, ServerHttpResponse> filterConfig);

}
