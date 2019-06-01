package test;
abstract class Device{
    private String name;
    public Device(){}
    public Device(String str){
        this.name = str;
    }
    public abstract double getPrice();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class AnanymousInner {
    void test(Device d){
        System.out.println("买了"+d.getName()+",花了"+d.getPrice()+"元");
    }
    public static void main(String[] args) {
        AnanymousInner i = new AnanymousInner();
//        调用有参构造器创建Device匿名实现类的对象
        i.test(new Device("电子示波器") {
            @Override
            public double getPrice() {
                return 67.8;
            }
        });
//        调用无参构造器创建Device匿名实现类的对象
        Device d = new Device() {
            @Override
            public double getPrice() {
                return 56.2;
            }
            @Override
            public String getName(){
                return "键盘";
            }
        };
        i.test(d);
    }
}
