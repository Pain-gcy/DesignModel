### 代理模式


注意事项：

    1、和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口。
    2、和装饰器模式的区别：装饰器模式为了增强功能，而代理模式是为了加以控制。

解决问题：

    对象创建开销很大，或者某些操作需要安全控制，或者需要进程外的访问，直接访问会给使用者或者系统结构带来很多麻烦
    租客 —— 中介 —— 房东