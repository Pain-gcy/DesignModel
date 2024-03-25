package com.demo.core.mode.decorator_装饰器;

/**
 * @author guochunyuan
 * @date 2024/3/25 11:11
 */
public class Petter implements Person{
    @Override
    public void eat() {
        System.out.println("msg" + "petter is eating");
    }
}
