package cn.bugstack.design.impl;


import cn.bugstack.design.OrderAdapterService;
import cn.bugstack.design.service.OrderService;

/**
 * 内部订单，判断首单逻辑
 */
public class InsideOrderServiceImpl implements OrderAdapterService {

    private OrderService orderService = new OrderService();

    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }

}
