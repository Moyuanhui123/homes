package com.aaa.house.service;

import com.aaa.house.dao.HouseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseDao houseDao;

    @Override
    public List<Map> getList() {
        return houseDao.getList();
    }

    @Override
    public Map getById(int id) {
        List<Map> mapList=houseDao.getById(id);
        if (mapList!=null&&mapList.size()>0){
            return mapList.get(0);
        }
        return null;
    }
}
