package com.demo.core.mode.decorator_装饰器;

/**
 * @author guochunyuan
 * @date 2024/3/25 11:13
 */
public class Main {
    public static void main(String[] args) {
        Person decorator = new PetterDecorator();
        decorator.eat();
    }
}
