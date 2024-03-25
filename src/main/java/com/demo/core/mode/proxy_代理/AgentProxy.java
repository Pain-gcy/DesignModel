package com.demo.core.mode.proxy_代理;

/**
 * @author guochunyuan
 * @date 2024/3/25 10:59
 * 代理类
 */
public class AgentProxy implements ProxyInterface{
    private Tenant mTenant;
    private String name;

    public AgentProxy(String name){
        this.name = name;
    }

    @Override
    public void buy() {
        if(mTenant == null){
            mTenant = new Tenant(name);
        }
        mTenant.buy();
    }
}
