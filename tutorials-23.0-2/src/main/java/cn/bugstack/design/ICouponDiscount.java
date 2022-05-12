package cn.bugstack.design;

import java.math.BigDecimal;

/**
 * @author 小傅哥，微信：fustack
 * @description 优惠券折扣计算接口
 * @date 2022/5/11
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface ICouponDiscount<T> {

    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);

}
