package cn.bugstack.design.impl;

import cn.bugstack.design.ICalculationArea;

/**
 * @description: 面积计算实现
 * @author: 小傅哥，微信：fustack
 * @date: 2022/3/5
 * @github: https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class CalculationArea implements ICalculationArea {

    private final static double π = 3.14D;

    public double rectangle(double x, double y) {
        return x * y;
    }

    public double triangle(double x, double y, double z) {
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    public double circular(double r) {
        return π * r * r;
    }

}
