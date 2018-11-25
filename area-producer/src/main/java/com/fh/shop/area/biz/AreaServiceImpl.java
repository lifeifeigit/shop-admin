package com.fh.shop.area.biz;

import com.fh.common.ServerResponse;
import com.fh.shop.area.mapper.IAreaMapper;
import com.fh.shop.area.po.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AreaServiceImpl
 * Description TODO
 * Author 李鹏飞
 * Date 2018/11/21 21:11
 * Version 1.0
 **/
@Service
public class AreaServiceImpl implements IAreaService {
    @Autowired
    private IAreaMapper areaMapper;

    @Override
    public ServerResponse queryAreaList() {
        List<Area> areaList = areaMapper.queryAreaList();
        return ServerResponse.success(areaList);
    }

    @Override
    public ServerResponse addArea(Area area) {
        areaMapper.addArea(area);
        return ServerResponse.success();
    }

    @Override
    public ServerResponse deteteArea(Integer id) {
        areaMapper.deteteArea(id);
        return ServerResponse.success();
    }

    @Override
    public ServerResponse updateArea(Area area) {
        areaMapper.updateArea(area);
        return ServerResponse.success();
    }
}
