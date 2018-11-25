package com.fh.shop.area.controller;

import com.fh.common.ServerResponse;
import com.fh.shop.area.biz.IAreaService;
import com.fh.shop.area.po.Area;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName AreaController
 * Description TODO
 * Author 李鹏飞
 * Date 2018/11/21 21:10
 * Version 1.0
 **/
@RestController
@RequestMapping("area")
public class AreaController {
    @Resource
    private IAreaService areaService;
    @PutMapping("/update")
    public ServerResponse updateArea(@RequestBody Area area) {
        return areaService.updateArea(area);
    }
    /**
     * @Author 李鹏飞
     * @Description //TODO
     * @Date 22:14 2018/11/21
     * @Param [删除id]
     * @return com.fh.common.ServerResponse
     **/

    @DeleteMapping("delete/{id}")
    public ServerResponse deteteArea(@PathVariable Integer id){
        return areaService.deteteArea(id);
    }
    /**
     * @Author 李鹏飞
     * @Description //TODO
     * @Date 22:10 2018/11/21
     * @Param [adAarea]
     * @return com.fh.common.ServerResponse
     **/

    @PostMapping("/add")
    public ServerResponse addArea(Area area){
        return areaService.addArea(area);
    }

    /**
     * @Author 李鹏飞
     * @Description //TODO
     * @Date 21:23 2018/11/21
     * @Param [查询]
     * @return com.fh.common.ServerResponse
     **/

    @GetMapping("list")
    public ServerResponse queryAreaList(){
        return areaService.queryAreaList();
    }

}
