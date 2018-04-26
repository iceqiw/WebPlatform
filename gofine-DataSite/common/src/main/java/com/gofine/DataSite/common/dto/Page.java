package com.gofine.DataSite.common.dto;

import java.util.List;
import lombok.Data;


@Data
public class Page {

  int start;

  int size;

  List context;

}
