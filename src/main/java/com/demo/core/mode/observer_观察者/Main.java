package com.demo.core.mode.observer_观察者;

/**
 * @author guochunyuan
 * @date 2024/3/25 10:32
 * 观察者模式
 *
 */
public class Main {
    public static void main(String[] args) {
        Subject sub = new RealizeSubject();
        sub.add(new ObserverAbleOne());
        sub.add(new ObserverAbleTwo());
        sub.operation();
    }
}
