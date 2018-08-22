/**
 * Copyright (C), 2015-2017, tsfa
 * FileName: OrderService.java
 * Author:   chin
 * Date:     2018/8/22    下午2:19
 * Description:
 * History: 修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名     修改时间      版本号        描述
 */
package com.springboot.dubbo.service;


/**
 * 订单服务接口<br>
 * 〈功能详细描述〉
 *
 * @author Chin
 * @since 1.0
 */
public interface OrderService {

    /**
     * 查询订单状态
     *
     * @param orderNo 订单号
     * @return 查询结果
     */
    String queryOrderStatus(String orderNo);
}
