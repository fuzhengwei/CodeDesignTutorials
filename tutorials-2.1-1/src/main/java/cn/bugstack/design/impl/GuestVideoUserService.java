package cn.bugstack.design.impl;

import cn.bugstack.design.IVideoUserService;

/**
 * @description: 访客用户
 * @author: 小傅哥，微信：fustack
 * @date: 2022/3/5
 * @github: https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class GuestVideoUserService implements IVideoUserService {

    public void definition() {
        System.out.println("访客用户，视频480P高清");
    }

    public void advertisement() {
        System.out.println("访客用户，视频有广告");
    }

}
