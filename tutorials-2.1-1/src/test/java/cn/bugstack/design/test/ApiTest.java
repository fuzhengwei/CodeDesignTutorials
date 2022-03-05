package cn.bugstack.design.test;

import cn.bugstack.design.IVideoUserService;
import cn.bugstack.design.impl.GuestVideoUserService;

/**
 * @description:
 * @author: 小傅哥，微信：fustack
 * @date: 2022/3/5
 * @github: https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class ApiTest {

    public static void main(String[] args) {
        IVideoUserService guest = new GuestVideoUserService();
        guest.advertisement();
        guest.definition();
        // 其他两个，自己补充
    }

}
