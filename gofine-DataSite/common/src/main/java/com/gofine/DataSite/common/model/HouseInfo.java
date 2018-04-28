package com.gofine.DataSite.common.model;

import java.math.BigDecimal;
import lombok.Data;


@Data
public class HouseInfo {

  private int id;
  private String name;
  private String village;
  private String floor;
  private String link;
  private BigDecimal acreage;
  private BigDecimal price;
  private boolean subway;
  private String datetime;
  private String address;
  private BigDecimal price_total;
  private String decoration;
  private String img;
  private String rent;

}
