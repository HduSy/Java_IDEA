package edu.usst.trek.src;

public class Student extends Person {
    /*
     * 子类中定义了与父类重名的实例变量会隐藏父类实例变量，优先(就近)访问子类实例变量 可通过super关键字访问父类被"覆盖"掉的实例变量
     * extends=>继承=>扩展
     */
    private String sname;
    //    private String name;//同名被覆盖问题
    private int sage;
    private double sheight;

    public Student(String str, int a, double h) {
        // TODO Auto-generated constructor stub
        /*
        所谓子类构造器调用父类构造器，利用父类构造器初始化父类public成员，子类可以直接继承其public部分
        不管有没有调用super，创建子类对象都会先执行父类构造函数
         */
        super(str, a);
//        sname = str;
//        sage = a;
        sheight = h;
    }

    public void say() {
        System.out.println("STU姓名：" + sname);
        System.out.println("STU姓名：" + name);//public,Student继承Person而来的
        System.out.println("Per姓名(public)：" + super.name);
//        System.out.println("STU年龄：" + age);//private,未继承,Student类不存在age成员变量,而只能通过Person暴露给其他类使用的getAge()方法访问
        System.out.println("Per年龄(private)：" + super.getAge());
        System.out.println("STU身高：" + sheight);
    }

    public void getPname() {
        System.out.println("子类查看父类私有部分有没有被更改：" + super.getName());
    }
}
