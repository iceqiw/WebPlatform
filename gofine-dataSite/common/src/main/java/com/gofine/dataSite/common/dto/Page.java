package com.gofine.dataSite.common.dto;

import java.util.List;
import lombok.Data;


@Data
public class Page {

  int start;

  int size;

  long total;

  List context;

}
