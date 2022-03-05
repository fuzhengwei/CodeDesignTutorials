package cn.bugstack.design;

/**
 * @description: 视频用户服务
 * @author: 小傅哥，微信：fustack
 * @date: 2022/3/5
 * @github: https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class VideoUserService {

    public void serveGrade(String userType){
        if ("VIP用户".equals(userType)){
            System.out.println("VIP用户，视频1080P蓝光");
        } else if ("普通用户".equals(userType)){
            System.out.println("普通用户，视频720P超清");
        } else if ("访客用户".equals(userType)){
            System.out.println("访客用户，视频480P高清");
        }
    }

}