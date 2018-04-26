package com.gofine.DataSite.mapper;

import com.gofine.DataSite.common.model.HouseInfo;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface HouseInfoMapper {


  // sql语句 分页查询
  final String SELECTBYPAGE = "select * from house limit #{start}, #{size}";

  final String INSERT = "INSERT INTO house (name,price,address,subway,acreage,floor,datetime,village,link,price_total) VALUES (#{name},#{price},#{address},#{subway},#{acreage},#{floor},#{datetime},#{village},#{link},#{price_total})";

  @Insert(INSERT)
  void save(HouseInfo houseInfo);

  @Select(SELECTBYPAGE)
  List<HouseInfo> findByPage(@Param("start") int start, @Param("size") int size);
}
