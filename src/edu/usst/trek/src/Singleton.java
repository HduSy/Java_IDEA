package edu.usst.trek.src;

public class Singleton {
    //    使用一个类变量缓存曾创建的实例
    private static Singleton instance;
    //    隐藏构造器
    private Singleton(){}
    //    提供公有静态方法返回Singleton实例，加入自定义控制保证只产生一个Singleton对象
    public static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
