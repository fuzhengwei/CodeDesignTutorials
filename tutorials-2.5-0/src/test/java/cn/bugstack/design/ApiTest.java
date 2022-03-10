package cn.bugstack.design;

import org.junit.Test;

/**
 * @description 单元测试
 * @author 小傅哥，微信：fustack
 * @date 2022/3/8
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @gitee https://gitee.com/fustack/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class ApiTest {

    @Test
    public void test_ISkill(){
        // 后裔
        HeroHouYi heroHouYi = new HeroHouYi();
        heroHouYi.doArchery();

        // 廉颇
        HeroLianPo heroLianPo = new HeroLianPo();
        heroLianPo.doInvisible();
    }

}
