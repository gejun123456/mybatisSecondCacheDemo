package com.example.mybatisplusspringbootcacheexample.mapper;

import com.example.mybatisplusspringbootcacheexample.entity.AdminCO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author bruce ge 2023/3/16
*/

@Mapper
public interface AdminMapper {
    int deleteByPrimaryKey(Integer adminId);

    int insert(AdminCO record);

    int insertSelective(AdminCO record);

    AdminCO selectByPrimaryKey(Integer adminId);

    int updateByPrimaryKeySelective(AdminCO record);

    int updateByPrimaryKey(AdminCO record);
}
