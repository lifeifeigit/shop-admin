package com.fh.shop.area.po;

import java.io.Serializable;

/**
 * @ClassName Area
 * Description TODO
 * Author 李鹏飞
 * Date 2018/11/21 21:09
 * Version 1.0
 **/
public class Area implements Serializable {
    private Integer id;
    private String areaName;
    private Integer fatherId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }
}
