package com.demo.core.Decoratormodel;

/**
 * @author guochunyuan
 * @create on  2018-10-22 11:22
 */
public class Jeans extends Decorator {
    @Override
    public void show(){
        System.out.println("穿牛仔裤");
        super.show();
    }
}
