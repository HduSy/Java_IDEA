package edu.usst.trek.interfaces;

public interface OutPut {
    int MAX_CACHE_LINE = 30;

    //	普通方法其实被public abstract修饰
    void out();

    void getData(String msg);

    //	默认方法
    default void print(String... msgs) {
        for (String msg : msgs) {
            System.out.println(msg);
        }
    }

    default void test() {
        System.out.println("默认的test方法");
    }

    //	接口中定义类方法
    static String staticTest() {
        return "接口中的类方法，跟普通类中定义类方法没什么两样加static而已";
    }

    //	私有方法
    private void foo() {
        System.out.println("foo私有方法");
    }

    private static void bar() {
        System.out.println("bar私有静态方法");
    }
}
