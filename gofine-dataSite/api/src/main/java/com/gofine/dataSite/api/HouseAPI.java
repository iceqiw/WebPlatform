package com.gofine.dataSite.api;


import com.gofine.dataSite.common.dto.Page;
import com.gofine.dataSite.common.model.House;
import com.gofine.dataSite.common.vo.RentVO;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/house")
public interface HouseAPI {

  @GetMapping("/index")
  String index();

  @PostMapping("/info")
  void addHouse(House vo);

  @DeleteMapping("/info/{id}")
  void delInfo(Integer id);

  @PostMapping("/collect_rent")
  void collectRent(RentVO vo);

  @GetMapping("/all")
  List<House> all();

  @GetMapping("/page/{start}/{size}")
  Page page(int start, int size);

  @GetMapping("/totalInfo")
  Map<String, Object> totalInfo();
}
