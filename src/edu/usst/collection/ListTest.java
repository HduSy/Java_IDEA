package edu.usst.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/10/29
 * Time: 15:58
 * Description: To change this template use File | Settings | File and Code Templates.
 */
public class ListTest {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new String("万般滋味都是生活"));
        books.add(new String("世界观"));
        System.out.println("books集合中的元素为：" + books);
        books.add(1, "算法笔记");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        books.remove(2);
        System.out.println(books);
        System.out.println(books.indexOf("世界观"));
        books.set(1, "Python基础教程");
        System.out.println(books);
        System.out.println(books.subList(1, 2));
    }
}
