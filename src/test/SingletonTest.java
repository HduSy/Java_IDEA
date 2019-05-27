package test;

import edu.usst.trek.src.Singleton;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/5/25
 * Time: 19:56
 * Description: 单例类
 */
public class SingletonTest{
    public static void main(String[] args) {
//        不能通过Singleton构造器创建Singleton对象
        Singleton si = Singleton.getInstance();
        Singleton st = Singleton.getInstance();
//        输出true
        System.out.println(si==st);
    }
}