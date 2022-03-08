package cn.bugstack.design.test;

import cn.bugstack.design.Principal;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @description: 测试
 * @author: 小傅哥，微信：fustack
 * @date: 2022/3/8
 * @github: https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_Principal() {
        Principal principal = new Principal();
        Map<String, Object> map = principal.queryClazzInfo("3年1班");
        logger.info("查询结果：{}", JSON.toJSONString(map));
    }

}
