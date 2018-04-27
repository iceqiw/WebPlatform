package com.gofine.DataSite.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

@ControllerAdvice(basePackages = "com.gofine.DataSite.controller")
public class JsonpAdvice extends AbstractJsonpResponseBodyAdvice {

  public JsonpAdvice() {

    super("callback", "jsonp");
  }
}
