package com.demo.core.mode.observer_观察者;

/**
 * @author guochunyuan
 * @date 2024/3/25 10:27
 * 观察者管理接口
 */
public interface Subject {
    void add(Observer observer);
    void del(Observer observer);
    void notifyAllObservers();
    void operation();
}
