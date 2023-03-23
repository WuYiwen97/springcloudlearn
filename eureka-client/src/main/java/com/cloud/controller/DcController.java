package com.cloud.controller;


import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    @SneakyThrows
    public String dc() {
        //Thread.sleep(5000L);
        log.info("dddd");
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

}