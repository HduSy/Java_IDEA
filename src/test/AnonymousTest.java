package test;

interface Product {
    double getPrice();

    String getName();
}

/**
 * 匿名内部类
 */
public class AnonymousTest {
    public void test(Product p) {
        System.out.println("买了一个" + p.getName() + ",花了" + p.getPrice());
    }

    public static void main(String[] args) {
        AnonymousTest a = new AnonymousTest();
        a.test(new Product() {
            @Override
            public double getPrice() {
                return 576.8;
            }

            @Override
            public String getName() {
                return "AGP显卡";
            }
        });
    }
}
