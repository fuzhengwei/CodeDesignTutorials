package cn.bugstack.design.test;

import cn.bugstack.design.ICalculationArea;
import cn.bugstack.design.impl.CalculationArea;
import cn.bugstack.design.impl.CalculationAreaExt;
import org.junit.Test;

/**
 * @description: 功能测试
 * @author: 小傅哥，微信：fustack
 * @date: 2022/3/5
 * @github: https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class ApiTest {

    @Test
    public void test_CalculationAreaExt(){
        ICalculationArea area = new CalculationAreaExt();
        double circular = area.circular(10);
        System.out.println(circular);
    }

}
