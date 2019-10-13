package test;

public class OutterClassTest {
    private int age = 23;
    class InnerClass{
        private int age = 24;
        public void info(){
            int age = 25;
            System.out.println("方法内age"+age);
            System.out.println("内部类age"+InnerClass.this.age);
            System.out.println("外部类age"+OutterClassTest.this.age);
        }
    }
    public void test(){
        InnerClass i = new InnerClass();
        i.info();
    }
    public static void main(String[] args) {
        OutterClassTest o = new OutterClassTest();
        o.test();
    }
}
