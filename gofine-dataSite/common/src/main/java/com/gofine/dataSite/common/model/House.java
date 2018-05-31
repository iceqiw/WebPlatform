package com.gofine.dataSite.common.model;


import lombok.Data;

@Data
public class House {

  private Integer id;

  private String name;

  private Double price;

  private String address;

  private Double acreage;

  private String floor;

  private String datetime;

  private String village;

  private String link;

  private Double priceTotal;

  private String img;

  private String rent;

  private byte[] subway;

}