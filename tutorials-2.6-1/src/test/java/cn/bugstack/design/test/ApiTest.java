package cn.bugstack.design.test;

import cn.bugstack.design.BetUser;
import cn.bugstack.design.DrawControl;
import cn.bugstack.design.DrawRandom;
import cn.bugstack.design.DrawWeightRank;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_DrawControl() {
        List<BetUser> betUserList = new ArrayList<>();
        betUserList.add(new BetUser("花花", 65));
        betUserList.add(new BetUser("豆豆", 43));
        betUserList.add(new BetUser("小白", 72));
        betUserList.add(new BetUser("笨笨", 89));
        betUserList.add(new BetUser("丑蛋", 10));

        DrawControl drawControl = new DrawControl(new DrawRandom());
        List<BetUser> prizeRandomUserList = drawControl.doDraw(betUserList, 3);
        logger.info("随机抽奖，中奖用户名单：{}", JSON.toJSON(prizeRandomUserList));

        drawControl = new DrawControl(new DrawWeightRank());
        List<BetUser> prizeWeightUserList = drawControl.doDraw(betUserList, 3);
        logger.info("权重抽奖，中奖用户名单：{}", JSON.toJSON(prizeWeightUserList));
    }

}
