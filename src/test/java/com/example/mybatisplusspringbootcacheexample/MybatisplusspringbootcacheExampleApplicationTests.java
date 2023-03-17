package com.example.mybatisplusspringbootcacheexample;

import com.example.mybatisplusspringbootcacheexample.mapper.AdminMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class MybatisplusspringbootcacheExampleApplicationTests {

    @Autowired
    private MyService myService;
    @Test
    void contextLoads() throws InterruptedException {
        myService.selectData();
        myService.selectData2();
        Thread.sleep(3000L);
        myService.selectData2();
    }


}
