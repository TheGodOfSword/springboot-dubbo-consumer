/**
 * Copyright (C), 2015-2017, tsfa
 * FileName: OrderController.java
 * Author:   chin
 * Date:     2018/8/22    下午2:27
 * Description:
 * History: 修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名     修改时间      版本号        描述
 */
package com.springboot.dubbo.controller;


import com.springboot.dubbo.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order/v1")
public class OrderController {

    public static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);


    @Autowired
    private OrderService orderService;

    @GetMapping("/query/{orderNo}")
    public String queryOrderStatus(@PathVariable("orderNo") String orderNo) {

        LOGGER.info("查询订单号:[{}]", orderNo);
        String orderStatus = orderService.queryOrderStatus(orderNo);
        LOGGER.info("订单状态:[{}]", orderStatus);

        return orderStatus;

    }
}
