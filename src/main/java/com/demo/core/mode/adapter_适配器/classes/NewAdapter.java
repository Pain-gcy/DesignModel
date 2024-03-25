package com.demo.core.mode.adapter_适配器.classes;

/**
 * @author guochunyuan
 * @date 2024/3/25 14:08
 */
public class NewAdapter extends Original implements ExpandInterface{
    @Override
    public void hide() {
        System.out.println("this is a new Adapter!!!");
    }
}
