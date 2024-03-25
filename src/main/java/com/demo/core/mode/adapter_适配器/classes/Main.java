package com.demo.core.mode.adapter_适配器.classes;

/**
 * @author guochunyuan
 * @date 2024/3/25 14:09
 */
public class Main {
    public static void main(String[] args) {
        // 类适配器
        NewAdapter newAdapter = new NewAdapter();
        newAdapter.hide();
        newAdapter.show();

        // 对象适配器
        ObjectAdapter objectAdapter = new ObjectAdapter();
        objectAdapter.hide();
        objectAdapter.show();

        // 接口适配器
        Expand expand = new Expand();
        expand.show();
        expand.close();
    }
}
