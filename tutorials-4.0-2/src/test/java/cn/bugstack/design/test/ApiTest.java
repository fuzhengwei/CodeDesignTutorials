package cn.bugstack.design.test;

import cn.bugstack.design.StoreFactory;
import cn.bugstack.design.store.ICommodity;
import cn.bugstack.design.store.impl.CouponCommodityService;
import org.junit.Test;

import java.util.HashMap;

/**
 * @author 小傅哥，微信：fustack
 * @description 单元测试
 * @date 2022/3/12
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class ApiTest {

    @Test
    public void test_StoreFactory_01() throws Exception {
        StoreFactory storeFactory = new StoreFactory();

        // 1. 优惠券
        ICommodity commodityService_1 = storeFactory.getCommodityService(1);
        commodityService_1.sendCommodity("10001", "EGM1023938910232121323432", "791098764902132", null);

        // 2. 实物商品
        ICommodity commodityService_2 = storeFactory.getCommodityService(2);
        commodityService_2.sendCommodity("10001", "9820198721311", "1023000020112221113", new HashMap<String, String>() {{
            put("consigneeUserName", "谢飞机");
            put("consigneeUserPhone", "15200292123");
            put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");
        }});

        // 3. 第三方兑换卡(模拟爱奇艺)
        ICommodity commodityService_3 = storeFactory.getCommodityService(3);
        commodityService_3.sendCommodity("10001", "AQY1xjkUodl8LO975GdfrYUio", null, null);

    }

    @Test
    public void test_StoreFactory_02() throws Exception {
        StoreFactory storeFactory = new StoreFactory();
        // 1. 优惠券
        ICommodity commodityService = storeFactory.getCommodityService(CouponCommodityService.class);
        commodityService.sendCommodity("10001", "EGM1023938910232121323432", "791098764902132", null);
    }

}
