package com.demo.core.mode.strategy_策略;

/**
 * @author guochunyuan
 * @date 2024/3/25 10:43
 */
public class Multiplication implements Function{
    @Override
    public int fun(int a, int b) {
        return a * b;
    }
}
