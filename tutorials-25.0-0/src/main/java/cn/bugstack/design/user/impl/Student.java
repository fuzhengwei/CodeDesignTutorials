package cn.bugstack.design.user.impl;

import cn.bugstack.design.user.User;
import cn.bugstack.design.visitor.Visitor;

import java.util.Random;

// 学生
public class Student extends User {

    public Student(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int ranking() {
        return (int) (Math.random() * 100);
    }

    public int count() {
        return 105 - new Random().nextInt(10);
    }

}
