package com.fh.shop.area.mapper;

import com.fh.shop.area.po.Area;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IAreaMapper {
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "areaName", property = "areaName"),
            @Result(column = "fatherId", property = "fatherId")
    })
    @Select("select id,areaName,fatherId from t_area")
    List<Area> queryAreaList();
    @Insert("Insert into t_area (areaName,fatherId) values(#{areaName},#{fatherId})")
    void addArea(Area area);
    @Delete("delete from t_area where id=#{value}")
    void deteteArea(Integer id);
    @Update("update t_area set areaName=#{areaName} where id=#{id}")
    void updateArea(Area area);
}
