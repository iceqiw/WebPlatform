package com.gofine.DataSite.controller;

import org.springframework.web.bind.annotation.RestController;
import com.gofine.DataSite.api.IndexAPI;
import com.gofine.DataSite.mapper.DemoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * server constroller
 *
 * @author qiwei
 * @create 2018/01/27
 **/
@RestController
@Slf4j
public class IndexController implements IndexAPI {


    @Autowired
    DemoMapper demoMapper;

    @Override
    public String index(){
        return "This is a demo for gofine-DataSite.";
    }
}
