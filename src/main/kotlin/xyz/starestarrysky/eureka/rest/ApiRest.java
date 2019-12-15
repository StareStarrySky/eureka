package xyz.starestarrysky.eureka.rest;

import feign.Feign;
import feign.Target;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.starestarrysky.eureka.service.ApiService;

import java.net.URI;

@RestController
@RequestMapping("/zty")
@Import(FeignClientsConfiguration.class)
public class ApiRest {
//    @Autowired
    private ApiService apiService;

    @Autowired
    public ApiRest(Decoder decoder, Encoder encoder) {
        apiService = Feign.builder()
                .encoder(encoder)
                .decoder(decoder)
                .target(Target.EmptyTarget.create(ApiService.class));
    }

    @GetMapping("/yearMonth")
    public String yearMonth() {
        String s = apiService.yearMonth(URI.create("http://127.0.0.1:8080/zty/year"));
        return s + "2";
    }

    @GetMapping("/year")
    public String year() {
        return "11";
    }
}
