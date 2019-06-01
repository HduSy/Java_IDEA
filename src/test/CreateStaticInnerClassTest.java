package test;

/**
 * 外部类外使用静态内部类
 * 与外部类相关
 */
class StaticOut{
    public StaticOut(){
        System.out.println("外部类构造器");
    }
    static class StaticIn{
        public StaticIn(){
            System.out.println("静态内部类构造器");
        }
    }
}
public class CreateStaticInnerClassTest {
    public static void main(String[] args) {
        StaticOut.StaticIn i = new StaticOut.StaticIn();
    }
}
