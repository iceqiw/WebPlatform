package com.gofine.DataSite.mapper;

import com.gofine.DataSite.common.model.HouseInfo;
import com.gofine.DataSite.common.vo.RentVO;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface HouseInfoMapper {


  // sql语句 分页查询
  final String SELECTBYPAGE = "select * from house limit #{start}, #{size}";

  final String INSERT = "INSERT INTO house (name,price,address,subway,acreage,floor,datetime,village,link,price_total,img) VALUES (#{name},#{price},#{address},#{subway},#{acreage},#{floor},#{datetime},#{village},#{link},#{price_total},#{img})";

  final String COUNT = "select count(id) from house";


  @Insert(INSERT)
  void save(HouseInfo houseInfo);

  @Select(SELECTBYPAGE)
  List<HouseInfo> findByPage(@Param("start") int start, @Param("size") int size);

  @Select(COUNT)
  long count();


  @Select("select distinct village from house")
  List<String> findVillage();

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

  @Update("update house set rent=#{rent} where village=#{village}")
  void updateRent(RentVO vo);

  @Delete("delete from house where id=#{id}")
  void del(@Param("id") Long id);
}
