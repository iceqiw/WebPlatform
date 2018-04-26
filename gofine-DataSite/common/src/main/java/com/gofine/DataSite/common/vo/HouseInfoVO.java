package com.gofine.DataSite.common.vo;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class HouseInfoVO {

  private String name;
  private String village;
  private String floor;
  private String houseType;
  private String decoration;
  private String url;
  private BigDecimal acreage;
  private BigDecimal price;
  private BigDecimal priceTotal;
  private String datetime;

}
