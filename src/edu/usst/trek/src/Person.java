package edu.usst.trek.src;

public class Person {
    public String name;
    //	private String name;
    private int age;//私有属性是属于类本身的不可被继承???

    Person() {
        System.out.println("Person的无参构造函数");
    }

    Person(String str) {
        name = str;
        System.out.println("Person的带姓名参数构造函数");
    }

    Person(String str, int a) {
        this(str);
        System.out.println("this调用同一个类下重载的构造器方法，必须写在第一行");
        setAge(a);
        System.out.println("Person的带姓名年龄参数的构造函数");
    }

    public void sayY() {
        System.out.println("Ptu姓名" + name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
