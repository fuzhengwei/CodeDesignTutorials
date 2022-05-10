package cn.bugstack.design.event.listener;

import cn.bugstack.design.LotteryResult;

/**
 * @author 小傅哥，微信：fustack
 * @description
 * @date 2022/5/9
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface EventListener {

    void doEvent(LotteryResult result);

}
