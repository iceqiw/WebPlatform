package com.gofine.DataSite.mapper;

import com.gofine.DataSite.common.model.Demo;
import java.util.List;
import org.apache.ibatis.annotations.Select;

public interface DemoMapper {

    @Select("select * from t_user_demo_info")
    List<Demo> selectAll();
}
