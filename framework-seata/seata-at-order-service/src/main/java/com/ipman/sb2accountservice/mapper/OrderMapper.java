package com.ipman.sb2accountservice.mapper;

import com.ipman.sb2accountservice.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {

    int insert(@Param("order") Order record);

}