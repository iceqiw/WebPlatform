package com.gofine.DataSite.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public interface IndexAPI {

    @GetMapping("/index")
    String index();
}
