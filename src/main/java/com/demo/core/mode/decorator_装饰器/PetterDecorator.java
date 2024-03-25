package com.demo.core.mode.decorator_装饰器;

/**
 * @author guochunyuan
 * @date 2024/3/25 11:11
 */
public class PetterDecorator implements Person{
    Petter mPetter;

    public PetterDecorator(){
        mPetter = new Petter();
    }
    @Override
    public void eat() {
        wash();
        mPetter.eat();
        sleep();
    }

    public void sleep(){
        System.out.println("msg eating after");
    }

    public void wash(){
        System.out.println("msg eating before");
    }
}
