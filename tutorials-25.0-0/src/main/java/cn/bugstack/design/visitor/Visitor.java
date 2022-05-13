package cn.bugstack.design.visitor;

import cn.bugstack.design.user.impl.Student;
import cn.bugstack.design.user.impl.Teacher;

/**
 * @author 小傅哥，微信：fustack
 * @description 访问者接口
 * @date 2022/5/13
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface Visitor {

    // 访问学生信息
    void visit(Student student);

    // 访问老师信息
    void visit(Teacher teacher);

}
