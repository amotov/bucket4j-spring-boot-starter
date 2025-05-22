package com.giffing.bucket4j.spring.boot.starter.filter.reactive.factory.impl;

import com.giffing.bucket4j.spring.boot.starter.context.properties.FilterConfiguration;
import com.giffing.bucket4j.spring.boot.starter.filter.reactive.factory.WebfluxWebFilterFactory;
import com.giffing.bucket4j.spring.boot.starter.filter.reactive.webflux.WebfluxWebFilter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;

public class DefaultWebfluxWebFilterFactory
        implements WebfluxWebFilterFactory {

    public WebfluxWebFilter create(
            FilterConfiguration<ServerHttpRequest, ServerHttpResponse> filterConfig) {
        return new WebfluxWebFilter(filterConfig);
    }

}
