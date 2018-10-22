package com.demo.core.factorymodel.factorymethod.impl;

import com.demo.core.factorymodel.factorymethod.Moveable;
import com.demo.core.factorymodel.factorymethod.VehicleFactory;

/**
 * @author guochunyuan
 * @create on  2018-10-22 10:16
 */
public class PlaneFactory extends VehicleFactory {
   public Moveable create(){
       return new Plane();
    }
}
