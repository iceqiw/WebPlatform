package com.gofine.dataSite.mapper;

import com.gofine.dataSite.common.model.House;
import com.gofine.dataSite.common.vo.RentVO;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface HouseMapper {

  int deleteByPrimaryKey(Integer id);

  int insert(House record);

  House selectByPrimaryKey(Integer id);

  List<House> selectAll();

  int updateByPrimaryKey(House record);

  void collectRent(RentVO vo);

  Long countAll();

  List<House> findByPage(@Param("start") int start, @Param("size") int size);

  @Select("select avg(price) from house")
  BigDecimal countAvgPrice();

  @Select("select max(price) from house")
  BigDecimal countMaxPrice();

  @Select("select min(price) from house")
  BigDecimal countMinPrice();

  @Select("select avg(price_total) from house")
  BigDecimal countAvgTotalPrice();

  @Select("select max(price_total) from house")
  BigDecimal countMaxTotalPrice();

  @Select("select min(price_total) from house")
  BigDecimal countMinTotalPrice();
}