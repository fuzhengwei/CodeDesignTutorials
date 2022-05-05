package cn.bugstack.design;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 小傅哥，微信：fustack
 * @description 管理员
 * @date 2022/5/5
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class Admin {

    private int cursorIdx = 0;
    private List<ConfigMemento> mementoList = new ArrayList<>();
    private Map<String, ConfigMemento> mementoMap = new ConcurrentHashMap<>();

    public void append(ConfigMemento memento) {
        mementoList.add(memento);
        mementoMap.put(memento.getConfigFile().getVersionNo(), memento);
        cursorIdx++;
    }

    public ConfigMemento undo() {
        if (--cursorIdx <= 0) return mementoList.get(0);
        return mementoList.get(cursorIdx);
    }

    public ConfigMemento redo() {
        if (++cursorIdx > mementoList.size()) return mementoList.get(mementoList.size() - 1);
        return mementoList.get(cursorIdx);
    }

    public ConfigMemento get(String versionNo) {
        return mementoMap.get(versionNo);
    }

}
