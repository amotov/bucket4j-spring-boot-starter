package com.giffing.bucket4j.spring.boot.starter.filter.servlet.impl;

import com.giffing.bucket4j.spring.boot.starter.context.properties.FilterConfiguration;
import com.giffing.bucket4j.spring.boot.starter.filter.servlet.ServletRateLimiterFilterFactory;
import com.giffing.bucket4j.spring.boot.starter.filter.servlet.ServletRateLimiterFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DefaultServletRateLimiterFilterFactory
        implements ServletRateLimiterFilterFactory {

    public ServletRateLimiterFilter create(
            FilterConfiguration<HttpServletRequest, HttpServletResponse> filterConfig) {
        return new DefaultServletRateLimiterFilter(filterConfig);
    }

}
