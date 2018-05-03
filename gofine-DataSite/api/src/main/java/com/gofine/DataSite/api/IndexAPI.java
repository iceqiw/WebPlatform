package com.gofine.DataSite.api;


import com.gofine.DataSite.common.dto.Page;
import com.gofine.DataSite.common.model.HouseInfo;
import com.gofine.DataSite.common.vo.HouseInfoVO;
import com.gofine.DataSite.common.vo.RentVO;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public interface IndexAPI {

  @GetMapping("/index")
  String index();


  @PostMapping("/info")
  void info(HouseInfoVO vo);

  @DeleteMapping("/info/{id}")
  void delInfo(Long id);

  @PostMapping("/rent")
  void rent(RentVO vo);

  @GetMapping("/page")
  Page page(Page vo);

  @GetMapping("/all")
  List<HouseInfo> all();

  @GetMapping("/page/{start}/{size}")
  Page page(int start, int size);

  @GetMapping("/villages")
  List<String> ListVillage();

  @GetMapping("/totalInfo")
  Map<String, Object> totalInfo();

}
