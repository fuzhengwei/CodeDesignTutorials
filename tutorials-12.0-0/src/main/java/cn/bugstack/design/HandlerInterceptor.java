package cn.bugstack.design;

public interface HandlerInterceptor {

    boolean preHandle(String request, String response, Object handler);

}