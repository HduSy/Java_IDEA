package test;

public class Cow {
    private double weight;

    public Cow() {
    }

    public Cow(double d) {
        this.weight = d;
    }

    class CowLeg {
        private String color;
        private double length;

        public CowLeg() {
        }

        public CowLeg(String color, double length) {
            this.color = color;
            this.length = length;
        }

        public void info() {
            System.out.println("牛颜色" + color + ",腿高" + length);
            System.out.println("体重" + weight);
        }
    }

    public void test() {
        CowLeg cl = new CowLeg("red",165.2);
        cl.info();
    }

    public static void main(String[] args) {
        Cow c = new Cow(100.5);
        c.test();
    }
}