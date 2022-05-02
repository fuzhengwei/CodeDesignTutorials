package cn.bugstack.design;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

import java.util.List;

/**
 * https://github.com/fuzhengwei/itstack-demo-jvm
 * 主要介绍如何通过java代码来实现JVM的基础功能（搜索解析class文件、字节码命令、运行时数据区等），从而让java程序员通过最熟知的java程序，学习JVM是如何将java程序一步步跑起来的
 */
public class Cmd {

    @Parameter(names = {"-?", "-help"}, description = "print help message", order = 3, help = true)
    public boolean helpFlag = false;

    @Parameter(names = "-version", description = "print version and exit", order = 2)
    public boolean versionFlag = false;

    @Parameter(names = {"-cp", "-classpath"}, description = "classpath", order = 1)
    public String classpath;

    @Parameter(description = "main class and args")
    public List<String> mainClassAndArgs;

    public boolean ok;

    public String getMainClass() {
        return mainClassAndArgs != null && !mainClassAndArgs.isEmpty()
                ? mainClassAndArgs.get(0)
                : null;
    }

    public List<String> getAppArgs() {
        return mainClassAndArgs != null && mainClassAndArgs.size() > 1
                ? mainClassAndArgs.subList(1, mainClassAndArgs.size())
                : null;
    }

    public static Cmd parse(String[] argv) {
        Cmd args = new Cmd();
        JCommander cmd = JCommander.newBuilder().addObject(args).build();
        cmd.parse(argv);
        args.ok = true;
        return args;
    }

}
