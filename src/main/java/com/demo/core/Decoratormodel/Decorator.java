package com.demo.core.Decoratormodel;

/**
 * @author guochunyuan
 * @create on  2018-10-22 11:21
 */
public class Decorator implements Component{
    private Component mComponent;
    public void decoratorObj(Component component){
        mComponent = component;
    }

    @Override
    public void show() {
        if(mComponent != null){
            mComponent.show();
        }
    }
}
