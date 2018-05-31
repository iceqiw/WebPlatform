package com.gofine.dataSite.controller;

import com.gofine.dataSite.api.HouseAPI;
import com.gofine.dataSite.common.dto.Page;
import com.gofine.dataSite.common.model.House;
import com.gofine.dataSite.common.vo.RentVO;
import com.gofine.dataSite.mapper.HouseMapper;
import com.gofine.dataSite.service.HouseService;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * server constroller
 *
 * @author qiwei
 * @create 2018/01/27
 **/
@RestController
@Slf4j
public class HouseController implements HouseAPI {


  @Autowired
  HouseMapper houseMapper;


  @Autowired
  HouseService houseService;

  @Override
  public String index() {
    return "This is a demo for gofine-dataSite.";
  }

  @Override
  public void addHouse(House vo) {
    houseMapper.insert(vo);
  }

  @Override
  public void delInfo(@PathVariable("id")Integer id) {
    houseMapper.deleteByPrimaryKey(id);
  }

  @Override
  public void collectRent(RentVO vo) {
    houseMapper.collectRent(vo);
  }

  @Override
  public List<House> all() {
    return houseMapper.selectAll();
  }

  @Override
  public Page page(@PathVariable("start") int start, @PathVariable("size") int size) {
    return houseService.page(start, size);
  }

  @Override
  public Map<String, Object> totalInfo() {
    return houseService.totalInfo();
  }
}
