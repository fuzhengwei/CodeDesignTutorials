package cn.bugstack.design.door.config;

import org.springframework.util.StringUtils;

/**
 * 切面定义
 * 公众号：bugstack虫洞栈 | 沉淀、分享、成长，让自己和他人都能有所收获！
 * 博  客：http://bugstack.cn
 * Create by 小傅哥 on @2020
 *
 * itstack:
 *   door:
 *     enabled: true
 *     userStr: 1001,aaaa,ccc #白名单用户ID，多个逗号隔开
 */
public class StarterService {

    private String userStr;

    public StarterService(String userStr) {
        this.userStr = userStr;
    }

    public String[] split(String separatorChar) {
        return StringUtils.split(this.userStr, separatorChar);
    }

}
