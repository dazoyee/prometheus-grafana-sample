package com.github.ioridazo.prometheus.grafana.sample.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ObserveController {

    @GetMapping("/sample")
    public String sample(){
        log.info("sample!");
        return "sample";
    }
}
