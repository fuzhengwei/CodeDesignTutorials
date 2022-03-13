package cn.bugstack.design;

import cn.bugstack.design.store.ICommodity;
import cn.bugstack.design.store.impl.CardCommodityService;
import cn.bugstack.design.store.impl.CouponCommodityService;
import cn.bugstack.design.store.impl.GoodsCommodityService;

/**
 * @author 小傅哥，微信：fustack
 * @description 工厂
 * @date 2022/3/12
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class StoreFactory {

    /**
     * 奖品类型方式实例化
     * @param commodityType 奖品类型
     * @return              实例化对象
     */
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的奖品服务类型");
    }

    /**
     * 奖品类信息方式实例化
     * @param clazz 奖品类
     * @return      实例化对象
     */
    public ICommodity getCommodityService(Class<? extends ICommodity> clazz) throws IllegalAccessException, InstantiationException {
        if (null == clazz) return null;
        return clazz.newInstance();
    }

}
