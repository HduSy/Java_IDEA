package edu.usst.collection;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/10/29
 * Time: 14:50
 * Description: Java8新增removeIf(Predicate p) Predicate为函数式接口，可使用Lambda表达式作为参数
 */
public class PredicateTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("万般滋味都是生活");
        books.add("世界观");
        books.removeIf(o -> o.equals("世界观"));
        System.out.println("books集合的元素为：" + books);
    }
}
