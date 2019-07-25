package com.aaa.house.controller;

import com.aaa.house.service.EmpService;
import com.aaa.house.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HouseController {
    @Autowired
    private HouseService houseService;
    @Autowired
    private EmpService empService;

    /**
     * 员工列表
     * @return
     */
    @RequestMapping("houseList")
    public Object list(){
        return houseService.getList();
    }

    /**
     * 根据ID获取对象
     * @param id
     * @return
     */
    @RequestMapping("houseById")
    public Object gethouse(Integer id){
        return houseService.getById(id);
    }
    @RequestMapping("houseperson")
    public Object getEmp(){
        return empService.getEmpList();
    }
}
