package com.demo.core.mode.adapter_适配器.classes;

/**
 * @author guochunyuan
 * @date 2024/3/25 14:11
 */
public class ObjectAdapter implements ExpandInterface{

    private Original mOriginal;

    public ObjectAdapter (){
        mOriginal = new Original();
    }

    @Override
    public void show() {
        mOriginal.show();
    }

    @Override
    public void hide() {
        System.out.println("this is a ObjectAdapter!!");
    }
}
