package com.demo.core.mode.strategy_策略;

/**
 * @author guochunyuan
 * @date 2024/3/25 10:45
 */
public class Main {
    public static void main(String[] args) {
        Execute execute = new Execute(new Addiction());
        System.out.println(execute.executeFunction(5, 2)+"");
        execute = new Execute(new Division());
        System.out.println(execute.executeFunction(5, 2)+"");
        execute = new Execute(new Subtraction());
        System.out.println(execute.executeFunction(5, 2)+"");
        execute = new Execute(new Multiplication());
        System.out.println(execute.executeFunction(5, 2)+"");

    }
}
