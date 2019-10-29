package edu.usst.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/10/29
 * Time: 14:13
 * Description: 容器
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("王季喜");
        c.add(6);//Java自动装箱
        System.out.println("c集合中元素个数：" + c.size());
        c.remove(6);
        System.out.println("c集合中元素个数：" + c.size());
        System.out.println("c集合中是否包含\"王季喜\"字符串：" + c.contains("王季喜"));
        c.add("涂聪");
        c.add("万般滋味都是生活");
        System.out.println("c集合的元素：" + c);
        Collection books = new HashSet();
        books.add("万般滋味都是生活");
        books.add("算法笔记");
        System.out.println("c集合是否完全包含books集合：" + c.containsAll(books));
        c.removeAll(books);
        System.out.println("c集合的元素：" + c);
        books.retainAll(c);
        System.out.println("books集合的元素" + books);
    }
}
