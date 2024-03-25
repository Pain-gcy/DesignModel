package com.demo.core.mode.strategy_策略;

/**
 * @author guochunyuan
 * @date 2024/3/25 10:45
 */
public class Execute {
    private Function mFunction;

    public Execute(Function function){
        this.mFunction = function;
    }

    public int executeFunction(int a,int b){
        return mFunction.fun(a,b);
    }

}
