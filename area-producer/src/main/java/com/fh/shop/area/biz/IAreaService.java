package com.fh.shop.area.biz;

import com.fh.common.ServerResponse;
import com.fh.shop.area.po.Area;

public interface IAreaService {
    ServerResponse queryAreaList();

    ServerResponse addArea(Area area);

    ServerResponse deteteArea(Integer id);

    ServerResponse updateArea(Area area);
}
