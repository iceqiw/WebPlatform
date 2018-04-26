package com.gofine.DataSite.service;

import com.gofine.DataSite.common.dto.Page;
import com.gofine.DataSite.common.model.HouseInfo;
import com.gofine.DataSite.mapper.HouseInfoMapper;
import java.util.List;
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
    List<HouseInfo> list = houseInfoMapper.findByPage(vo.getStart(), vo.getSize());
    vo.setContext(list);
    return vo;
  }
}
