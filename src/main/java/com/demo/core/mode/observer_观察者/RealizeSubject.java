package com.demo.core.mode.observer_观察者;

/**
 * @author guochunyuan
 * @date 2024/3/25 10:31
 */
public class RealizeSubject extends AbstractSubject{
    @Override
    public void operation() {
        super.operation();
        System.out.println("msg" + "update");
        notifyAllObservers();
    }
}
