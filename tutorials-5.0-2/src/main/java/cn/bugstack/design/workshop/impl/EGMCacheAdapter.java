package cn.bugstack.design.workshop.impl;

import cn.bugstack.design.redis.cluster.EGM;
import cn.bugstack.design.workshop.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * @author 小傅哥，微信：fustack
 * @description
 * @date 2022/3/17
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class EGMCacheAdapter implements ICacheAdapter {

    private EGM egm = new EGM();

    public String get(String key) {
        return egm.gain(key);
    }

    public void set(String key, String value) {
        egm.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        egm.delete(key);
    }

}
