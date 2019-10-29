package edu.usst.generic;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/10/29
 * Time: 16:25
 * Description: 定义泛型类 逻辑子类在物理上并不存在
 */
public class Apple<T> {
    private T info;
    public Apple(){}
    public Apple(T info){
        this.info = info;
    }
    public void setInfo(T info){
        this.info = info;
    }
    public T getInfo(){
        return this.info;
    }

    public static void main(String[] args) {
        Apple<String> a1 = new Apple<>("苹果");
        Apple<Double> a2 = new Apple<>(5.67);
        System.out.println(a1.getInfo());
        System.out.println(a2.getInfo());
    }
}
