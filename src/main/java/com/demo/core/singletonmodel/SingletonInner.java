package com.demo.core.singletonmodel;

/**
 * @author guochunyuan
 * @create on  2018-10-22 10:00
 *
 * 双重线程检查模式
 *
 * 优点：延迟加载，线程安全
 * 缺点： 写法复杂，不简洁
 */
public class SingletonInner {

    private static volatile SingletonInner sInst = null;  // <<< 这里添加了 volatile

    /**
     * 私有的构造函数
     */
    private SingletonInner() {}

    public static SingletonInner getInstance() {
        SingletonInner inst = sInst;  // <<< 在这里创建临时变量
        if (inst == null) { // 提升效率
            synchronized (SingletonInner.class) {  // 多线程安全
                inst = sInst;
                if (inst == null) {
                    inst = new SingletonInner();
                    sInst = inst;
                }
            }
        }
        return inst;  // <<< 注意这里返回的是临时变量
    }

    protected void method() {
        System.out.println("SingletonInner");
    }
}
