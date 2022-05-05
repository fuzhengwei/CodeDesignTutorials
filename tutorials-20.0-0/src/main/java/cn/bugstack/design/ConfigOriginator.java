package cn.bugstack.design;

/**
 * @author 小傅哥，微信：fustack
 * @description 记录者
 * @date 2022/5/5
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class ConfigOriginator {

    private ConfigFile configFile;

    public ConfigFile getConfigFile() {
        return configFile;
    }

    public void setConfigFile(ConfigFile configFile) {
        this.configFile = configFile;
    }

    public ConfigMemento saveMemento(){
        return new ConfigMemento(this.configFile);
    }

    public void getMemento(ConfigMemento configMemento){
        this.configFile = configMemento.getConfigFile();
    }

}
