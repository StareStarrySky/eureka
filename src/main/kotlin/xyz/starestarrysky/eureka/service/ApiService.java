package xyz.starestarrysky.eureka.service;

import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URI;

@FeignClient(name = "apiService")
@RequestMapping("/zty")
public interface ApiService {
    @RequestLine("GET")
    String yearMonth(URI uri);
}
