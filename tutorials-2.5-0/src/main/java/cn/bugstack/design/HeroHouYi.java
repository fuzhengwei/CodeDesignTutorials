package cn.bugstack.design;

/**
 * @description 王者英雄，后裔
 * @author 小傅哥，微信：fustack
 * @date 2022/3/8
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @gitee https://gitee.com/fustack/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class HeroHouYi implements ISkill{

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

    @Override
    public void doVertigo() {
        // 无此技能的实现
    }

}
