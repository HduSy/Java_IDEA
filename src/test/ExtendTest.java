package test;

import edu.usst.trek.src.Student;


/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/5/25
 * Time: 15:26
 * Description: 继承后隐藏的概念、子类构造器调用父类构造器(显式与隐式)、super调用父类构造器
 */
public class ExtendTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student songyao = new Student("宋垚", 23, 170.0);
        songyao.say();
        songyao.sayY();
        songyao.getPname();
    }

}
