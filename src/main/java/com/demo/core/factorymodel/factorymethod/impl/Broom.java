package com.demo.core.factorymodel.factorymethod.impl;

import com.demo.core.factorymodel.factorymethod.Moveable;

/**
 * @author guochunyuan
 * @create on  2018-10-22 10:09
 */
public class Broom implements Moveable {
    @Override
    public void run() {
        System.out.println("broom.....");
    }
}
