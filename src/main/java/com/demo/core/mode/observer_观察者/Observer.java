package com.demo.core.mode.observer_观察者;

/**
 * @author guochunyuan
 * @date 2024/3/25 10:22
 * 观察者模式
 * 特点
 * 类和类之间的关系
 * 对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新
 */
public interface Observer {

    void update();

}
