package cn.bugstack.design;

import java.util.HashMap;

/**
 * @author 小傅哥，微信：fustack
 * @description 题库管理
 * @date 2022/3/22
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class QuestionBankController {

    private QuestionBank questionBank = new QuestionBank();

    public QuestionBankController() {
        questionBank.append(new ChoiceQuestion("JAVA所定义的版本中不包括", new HashMap<String, String>() {{
            put("A", "JAVA2 EE");
            put("B", "JAVA2 Card");
            put("C", "JAVA2 ME");
            put("D", "JAVA2 HE");
            put("E", "JAVA2 SE");
        }}, "D")).append(new ChoiceQuestion("下列说法正确的是", new HashMap<String, String>() {{
            put("A", "JAVA程序的main方法必须写在类里面");
            put("B", "JAVA程序中可以有多个main方法");
            put("C", "JAVA程序中类名必须与文件名一样");
            put("D", "JAVA程序的main方法中如果只有一条语句，可以不用{}(大括号)括起来");
        }}, "A")).append(new ChoiceQuestion("变量命名规范说法正确的是", new HashMap<String, String>() {{
            put("A", "变量由字母、下划线、数字、$符号随意组成；");
            put("B", "变量不能以数字作为开头；");
            put("C", "A和a在java中是同一个变量；");
            put("D", "不同类型的变量，可以起相同的名字；");
        }}, "B")).append(new ChoiceQuestion("以下()不是合法的标识符", new HashMap<String, String>() {{
            put("A", "STRING");
            put("B", "x3x;");
            put("C", "void");
            put("D", "de$f");
        }}, "C")).append(new ChoiceQuestion("表达式(11+3*8)/4%3的值是", new HashMap<String, String>() {{
            put("A", "31");
            put("B", "0");
            put("C", "1");
            put("D", "2");
        }}, "D"))
                .append(new AnswerQuestion("小红马和小黑马生的小马几条腿", "4条腿"))
                .append(new AnswerQuestion("铁棒打头疼还是木棒打头疼", "头最疼"))
                .append(new AnswerQuestion("什么床不能睡觉", "牙床"))
                .append(new AnswerQuestion("为什么好马不吃回头草", "后面的草没了"));
    }

    public String createPaper(String candidate, String number) throws CloneNotSupportedException {
        QuestionBank questionBankClone = (QuestionBank) questionBank.clone();
        questionBankClone.setCandidate(candidate);
        questionBankClone.setNumber(number);
        return questionBankClone.toString();
    }

}
