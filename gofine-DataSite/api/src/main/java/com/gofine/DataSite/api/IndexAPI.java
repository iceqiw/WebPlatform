package com.gofine.DataSite.api;


import com.gofine.DataSite.common.dto.Page;
import com.gofine.DataSite.common.vo.HouseInfoVO;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public interface IndexAPI {

  @GetMapping("/index")
  String index();


  @PostMapping("/info")
  void info(HouseInfoVO vo);

  @GetMapping("/page")
  Page page(Page vo);

  @GetMapping("/page/{start}/{size}")
  Page page(@PathVariable("start") int start, @PathVariable("size") int size);

  @GetMapping("/villages")
  List<String> ListVillage();

  @GetMapping("/totalInfo")
  Map<String, Object> totalInfo();

}
