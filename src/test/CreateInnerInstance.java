package test;

/**
 * 外部类以外使用非静态内部类
 * 与外部类对象相关
 */
class Out{
    public Out(){
        System.out.println("外部类构造器");
    }
    class In{
        public In(){
            System.out.println("非静态内部类构造器");
        }
    }
}
public class CreateInnerInstance {
    public static void main(String[] args) {
        Out.In i = new Out().new In();
    }
}
