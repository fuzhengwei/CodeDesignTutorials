package cn.bugstack.design;

import java.util.Map;

/**
 * @author 小傅哥，微信：fustack
 * @description 发奖请求对象
 * @date 2022/3/12
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @gitee https://gitee.com/fustack/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class AwardReq {

    private String uId;                 // 用户唯一ID
    private Integer awardType;          // 奖品类型(可以用枚举定义)；1优惠券、2实物商品、3第三方兑换卡(爱奇艺)
    private String awardNumber;         // 奖品编号；sku、couponNumber、cardId
    private String bizId;               // 业务ID，防重复
    private Map<String, String> extMap; // 扩展信息

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Integer getAwardType() {
        return awardType;
    }

    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }

    public String getAwardNumber() {
        return awardNumber;
    }

    public void setAwardNumber(String awardNumber) {
        this.awardNumber = awardNumber;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public Map<String, String> getExtMap() {
        return extMap;
    }

    public void setExtMap(Map<String, String> extMap) {
        this.extMap = extMap;
    }
}
