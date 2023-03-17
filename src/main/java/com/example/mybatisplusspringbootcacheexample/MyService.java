package com.example.mybatisplusspringbootcacheexample;

import com.example.mybatisplusspringbootcacheexample.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author bruce ge 2023/3/16
 */
@Service
public class MyService {
    @Autowired
    private AdminMapper adminMapper;

    @Transactional
    public void selectData(){
        adminMapper.selectByPrimaryKey(1);
        adminMapper.selectByPrimaryKey(1);
    }


    @Transactional
    public void selectData2(){
        adminMapper.selectByPrimaryKey(1);
    }
}
