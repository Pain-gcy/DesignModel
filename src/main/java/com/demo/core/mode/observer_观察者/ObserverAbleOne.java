package com.demo.core.mode.observer_观察者;

/**
 * @author guochunyuan
 * @date 2024/3/25 10:25
 */
public class ObserverAbleOne implements Observer {
    @Override
    public void update() {
        System.out.println("msg Observerable1 has received");
    }
}
