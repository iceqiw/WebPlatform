package com.gofine.dataSite.controller;

import com.gofine.dataSite.api.IndexAPI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * server constroller
 *
 * @author qiwei
 * @create 2018/01/27
 **/
@RestController
@Slf4j
public class IndexController implements IndexAPI {


  @Override
  public String index() {
    return "This is a demo for gofine-dataSite.";
  }
}
