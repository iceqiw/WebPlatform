package com.gofine.DataSite.service;

import com.gofine.DataSite.common.dto.Page;
import com.gofine.DataSite.common.model.HouseInfo;
import com.gofine.DataSite.mapper.HouseInfoMapper;
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
public class HouseInfoService {

  @Autowired
  HouseInfoMapper houseInfoMapper;


  public void save(HouseInfo houseInfo) {
    houseInfoMapper.save(houseInfo);
  }

  public Page page(Page vo) {
    int start = (vo.getStart() - 1) * vo.getSize();
    List<HouseInfo> list = houseInfoMapper.findByPage(start, vo.getSize());
    vo.setContext(list);
    return vo;
  }

  public Page page(int start, int size) {
    Page page = new Page();
    page.setSize(size);
    page.setStart(start);
    start = (start - 1) * size;
    long total = houseInfoMapper.count();
    List<HouseInfo> list = houseInfoMapper.findByPage(start, size);
    page.setContext(list);
    page.setTotal(total);
    return page;
  }

  public List<String> ListVillage() {
    return houseInfoMapper.findVillage();
  }

  public Map<String, Object> totalInfo() {
    Map<String, Object> totalInfo = new HashMap<>();
    totalInfo.put("avg", houseInfoMapper.countAvgPrice().longValue());
    totalInfo.put("max", houseInfoMapper.countMaxPrice());
    totalInfo.put("min", houseInfoMapper.countMinPrice());
    totalInfo.put("total_avg", houseInfoMapper.countAvgTotalPrice().longValue());
    totalInfo.put("total_max", houseInfoMapper.countMaxTotalPrice());
    totalInfo.put("total_min", houseInfoMapper.countMinTotalPrice());
    return totalInfo;
  }
}
