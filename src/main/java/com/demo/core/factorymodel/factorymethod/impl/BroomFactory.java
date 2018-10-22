package com.demo.core.factorymodel.factorymethod.impl;

import com.demo.core.factorymodel.factorymethod.Moveable;
import com.demo.core.factorymodel.factorymethod.VehicleFactory;

/**
 * @author guochunyuan
 * @create on  2018-10-22 10:36
 */
public class BroomFactory extends VehicleFactory {
    @Override
    public Moveable create() {
        return new Broom();
    }
}
