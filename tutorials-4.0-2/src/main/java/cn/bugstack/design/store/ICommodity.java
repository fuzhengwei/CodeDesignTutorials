package cn.bugstack.design.store;

import java.util.Map;

/**
 * @author 小傅哥，微信：fustack
 * @description 发放商品接口
 * @date 2022/3/12
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface ICommodity {

    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;

}
