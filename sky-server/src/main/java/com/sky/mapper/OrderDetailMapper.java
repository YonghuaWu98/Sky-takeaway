package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDetailMapper {
    /*
     * 批量插入订单详情数据
     * @return: void
     **/
    void insertByBatch(List<OrderDetail> orderDetails);
}
