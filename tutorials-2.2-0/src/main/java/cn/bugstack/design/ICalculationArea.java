package cn.bugstack.design;

/**
 * @description: 面积计算接口
 * @author: 小傅哥，微信：fustack
 * @date: 2022/3/5
 * @github: https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface ICalculationArea {

    /**
     * 计算面积，长方形
     *
     * @param x 长
     * @param y 宽
     * @return 面积
     */
    double rectangle(double x, double y);

    /**
     * 计算面积，三角形
     * @param x 边长x
     * @param y 边长y
     * @param z 边长z
     * @return  面积
     *
     * 海伦公式：S=√[p(p-a)(p-b)(p-c)] 其中：p=(a+b+c)/2
     */
    double triangle(double x, double y, double z);

    /**
     * 计算面积，圆形
     * @param r 半径
     * @return 面积
     *
     * 圆面积公式：S=πr²
     */
    double circular(double r);

}
