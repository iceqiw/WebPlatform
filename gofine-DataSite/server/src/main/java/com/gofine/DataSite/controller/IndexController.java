package com.gofine.DataSite.controller;

import com.gofine.DataSite.api.IndexAPI;
import com.gofine.DataSite.common.dto.Page;
import com.gofine.DataSite.common.mapstruct.HouseInfoStructer;
import com.gofine.DataSite.common.model.HouseInfo;
import com.gofine.DataSite.common.vo.HouseInfoVO;
import com.gofine.DataSite.common.vo.RentVO;
import com.gofine.DataSite.service.HouseInfoService;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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


  @Autowired
  HouseInfoService houseInfoService;

  @Autowired
  HouseInfoStructer houseInfoStructer;

  @Override
  public String index() {
    return "This is a demo for gofine-DataSite.";
  }

  @Override
  public void info(@RequestBody HouseInfoVO vo) {
    HouseInfo houseInfo = houseInfoStructer.fromVo2Model(vo);
    houseInfoService.save(houseInfo);
    log.info(houseInfo.toString());
  }

  @Override
  public void delInfo(@PathVariable("id") Long id) {
    houseInfoService.del(id);
  }

  @Override
  public Page page(Page vo) {
    return houseInfoService.page(vo);
  }

  @Override
  public Page page(@PathVariable("start") int start, @PathVariable("size") int size) {
    return houseInfoService.page(start, size);
  }

  @Override
  public List<String> ListVillage() {
    return houseInfoService.ListVillage();
  }

  @Override
  public Map<String, Object> totalInfo() {
    return houseInfoService.totalInfo();
  }

  @Override
  public void rent(RentVO vo) {
    houseInfoService.updateRent(vo);
  }
}
