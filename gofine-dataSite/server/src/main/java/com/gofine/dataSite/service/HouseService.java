package com.gofine.dataSite.service;

import com.gofine.dataSite.common.dto.Page;
import com.gofine.dataSite.common.model.House;
import com.gofine.dataSite.mapper.HouseMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * just a demo
 *
 * @author qiwei
 * @create 2018/01/31
 **/
@Service
public class HouseService {

  @Autowired
  HouseMapper houseMapper;


  public Page page(int start, int size) {
    Page page = new Page();
    page.setSize(size);
    page.setStart(start);
    start = (start - 1) * size;
    long total = houseMapper.countAll();
    List<House> list = houseMapper.findByPage(start, size);
    page.setContext(list);
    page.setTotal(total);
    return page;
  }

  public Map<String, Object> totalInfo() {
    Map<String, Object> totalInfo = new HashMap<>();
    totalInfo.put("avg", houseMapper.countAvgPrice().longValue());
    totalInfo.put("max", houseMapper.countMaxPrice());
    totalInfo.put("min", houseMapper.countMinPrice());
    totalInfo.put("total_avg", houseMapper.countAvgTotalPrice().longValue());
    totalInfo.put("total_max", houseMapper.countMaxTotalPrice());
    totalInfo.put("total_min", houseMapper.countMinTotalPrice());
    return totalInfo;
  }

}
