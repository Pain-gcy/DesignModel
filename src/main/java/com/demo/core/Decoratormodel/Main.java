package com.demo.core.Decoratormodel;

/**
 * @author guochunyuan
 * @create on  2018-10-22 11:22
 * 模式有以下的优缺点：
 * 比静态继承更灵活与对象的静态继承相比，Decorator模式提供了更加灵活的向对象添加职责的方式，可以使用添加和分离的方法，用装饰在运行时刻增加和删除职责。使用继承机制增加职责需要创建一个新的子类，如果需要为原来所有的子类都添加功能的话，每个子类都需要重写，增加系统的复杂度，此外可以为一个特定的Component类提供多个Decorator，这种混合匹配是适用继承很难做到的。
 * 避免在层次结构高层的类有太多的特征，Decorator模式提供了一种“即用即付”的方法来添加职责，他并不试图在一个复杂的可订制的类中支持所有可预见的特征，相反可以定义一个简单的类，并且用Decorator类给他逐渐的添加功能，从简单的部件组合出复杂的功能。
 * Decorator 与它的Component不一样Decorator是一个透明的包装，如果我们从对象标识的观点出发，一个被装饰了的组件与这个组件是有差别的，因此使用装饰时不应该以来对象标识。
 * 产生许多小对象，采用Decorator模式进行系统设计往往会产生许多看上去类似的小对象，这些对象仅仅在他们相互连接的方式上有所不同。
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Andy.Chen Blog!" +"\n"
                +"Decorator Patterns." +"\n");

        Person mPerson = new Person("Andy");

//        Sandal mSandal = new Sandal();
        Jeans mJeans = new Jeans();
//        TShirt mShirt = new TShirt();

//        mShirt.decoratorObj(mPerson);
        mJeans.decoratorObj(mPerson);
//        mSandal.decoratorObj(mJeans);
//        mSandal.show();
        mJeans.show();
    }
}
