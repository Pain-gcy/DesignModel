package com.demo.core.singletonmodel;

/**
 * @author guochunyuan
 * @create on  2018-10-22 9:59
 */
public class Main {

    public static void main(String[] args) {
        LazySingletonClass.getInstance().test();
        SingletonInner.getInstance().method();
        SingletonInnerTwo.getInstance().method();
    }
}
