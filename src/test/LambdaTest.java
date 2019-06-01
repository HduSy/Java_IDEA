package test;

interface Eatable {
    void taste();
}

interface Flyable {
    void fly(String weather);
}

interface Addable {
    int add(int a, int b);
}

public class LambdaTest {
    public void eat(Eatable e) {
        e.taste();
    }

    public void drive(Flyable f) {
        f.fly("天蓝蓝晴空万里");
    }

    public void test(Addable a, int b, int c) {
        System.out.println(b + "+" + c + "=" + a.add(b, c));
    }

    public static void main(String[] args) {
        LambdaTest lt = new LambdaTest();
//        重写taste
        lt.eat(() -> {
            System.out.println("Apple tastes good.");
        });
//        c重写drive
        lt.drive(weather -> {
            System.out.println("今天天气是：" + weather);
            System.out.println("老司机飞的很稳");
        });
//        重写add
        lt.test((a, b) -> a + b, 4, 5);
    }
}
