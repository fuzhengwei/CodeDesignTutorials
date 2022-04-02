package cn.bugstack.design;

import cn.bugstack.design.mq.create_account;
import com.alibaba.fastjson.JSON;

public class create_accountMqService {

    public void onMessage(String message) {

        create_account mq = JSON.parseObject(message, create_account.class);

        mq.getNumber();
        mq.getAccountDate();

        // ... 处理自己的业务
    }

}
