package com.cherry.monitor;

import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Cherry
 * @Date: 2022/3/25
 * @Desc: MonitorDemoApplication
 */
@EnablePrometheusEndpoint
@EnableSpringBootMetricsCollector
@SpringBootApplication
public class MonitorDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitorDemoApplication.class, args);
    }

}
