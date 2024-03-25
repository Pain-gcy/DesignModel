package com.demo.core.mode.proxy_代理;

/**
 * @author guochunyuan
 * @date 2024/3/25 10:58
 * 被代理 类
 */
public class Tenant implements ProxyInterface{
    private String name;

    public Tenant(String name){
        this.name = name;
    }

    @Override
    public void buy() {
        System.out.println("buy----: " + name);
    }
}
