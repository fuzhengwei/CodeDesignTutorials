package cn.bugstack.design.impl;

import cn.bugstack.design.ISkillArchery;
import cn.bugstack.design.ISkillInvisible;
import cn.bugstack.design.ISkillSilent;

/**
 * @author 小傅哥，微信：fustack
 * @description 王者英雄，后裔
 * @date 2022/3/10
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class HeroHouYi implements ISkillArchery, ISkillInvisible, ISkillSilent {

    @Override
    public void doArchery() {
        System.out.println("后裔的灼日之矢");
    }

    @Override
    public void doInvisible() {
        System.out.println("后裔的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("后裔的沉默技能");
    }

}
