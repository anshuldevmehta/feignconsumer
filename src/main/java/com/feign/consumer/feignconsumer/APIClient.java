package com.feign.consumer.feignconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "ALGO-SERVICE", url = "http://localhost:8080")
public interface APIClient {

    @GetMapping(value = "/stringping")
    String pingStringController();
}
