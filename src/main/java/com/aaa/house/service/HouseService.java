package com.aaa.house.service;


import java.util.List;
import java.util.Map;

public interface HouseService {
    /**
     * 查询列表
     * @return
     */
    List<Map> getList();

    /**
     * 根据ID获取对象
     * @param id
     * @return
     */
    Map getById(int id);
}
