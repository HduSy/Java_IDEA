package test;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/5/25
 * Time: 19:56
 * Description: 单例类
 */
class Singleton {
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
public class SingletonTest{
    public static void main(String[] args) {
//        不能通过Singleton构造器创建Singleton对象
        Singleton si = Singleton.getInstance();
        Singleton st = Singleton.getInstance();
//        输出true
        System.out.println(si==st);
    }
}