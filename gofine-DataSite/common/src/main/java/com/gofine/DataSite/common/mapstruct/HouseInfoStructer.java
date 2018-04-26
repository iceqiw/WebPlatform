package com.gofine.DataSite.common.mapstruct;


import com.gofine.DataSite.common.model.HouseInfo;
import com.gofine.DataSite.common.vo.HouseInfoVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface HouseInfoStructer {

  @Mappings({
      @Mapping(source = "vo.url", target = "link"),
      @Mapping(source = "vo.priceTotal", target = "price_total")
  })
  HouseInfo fromVo2Model(HouseInfoVO vo);

  @Mappings({
      @Mapping(source = "model.link", target = "url"),
      @Mapping(source = "model.price_total", target = "priceTotal")
  })
  HouseInfoVO fromModel2Vo(HouseInfo model);
}
