package cn.bugstack.design.domain.service.engine.impl;

import cn.bugstack.design.domain.model.aggregates.TreeRich;
import cn.bugstack.design.domain.model.vo.EngineResult;
import cn.bugstack.design.domain.model.vo.TreeNode;
import cn.bugstack.design.domain.service.engine.EngineBase;

import java.util.Map;

/**
 * @author 小傅哥，微信：fustack
 * @description
 * @date 2022/4/5
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class TreeEngineHandle extends EngineBase {

    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }

}
