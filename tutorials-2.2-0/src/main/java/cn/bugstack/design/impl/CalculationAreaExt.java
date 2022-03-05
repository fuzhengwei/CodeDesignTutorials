package cn.bugstack.design.impl;

/**
 * @description: 扩展继承，实现自己的需求
 * @author: 小傅哥，微信：fustack
 * @date: 2022/3/5
 * @github: https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class CalculationAreaExt extends CalculationArea {

    private final static double π = 3.141592653D;

    @Override
    public double circular(double r) {
        return π * r * r;
    }

}
