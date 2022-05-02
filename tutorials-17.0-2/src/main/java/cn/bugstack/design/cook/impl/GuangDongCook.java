package cn.bugstack.design.cook.impl;

import cn.bugstack.design.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 小傅哥，微信：fustack
 * @description
 * @date 2022/5/2
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class GuangDongCook implements ICook {

    private Logger logger = LoggerFactory.getLogger(ICook.class);

    @Override
    public void doCooking() {
        logger.info("广东厨师，烹饪鲁菜，宫廷菜系，以孔府风味为龙头");
    }

}
