package cn.bugstack.design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 小傅哥，微信：fustack
 * @description 抽奖控制
 * @date 2022/3/11
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @gitee https://gitee.com/fustack/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class DrawControl {

    private IDraw draw;

    public List<BetUser> doDraw(IDraw draw, List<BetUser> betUserList, int count) {
        return draw.prize(betUserList, count);
    }

}
