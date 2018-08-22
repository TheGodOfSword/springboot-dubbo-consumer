/**
 * Copyright (C), 2015-2017, tsfa
 * FileName: OrderServiceImpl.java
 * Author:   chin
 * Date:     2018/8/22    下午2:19
 * Description:
 * History: 修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名     修改时间      版本号        描述
 */
package com.springboot.dubbo.service.impl;


import com.alibaba.dubbo.config.annotation.Reference;
import com.springboot.dubbo.api.OrderApi;
import com.springboot.dubbo.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 订单服务实现类<br>
 * 〈功能详细描述〉
 *
 * @author Chin
 * @since 1.0
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    public static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Reference
    private OrderApi orderApi;


    @Override
    public String queryOrderStatus(String orderNo) {


        return orderApi.queryOrderStatus(orderNo);
    }
}
