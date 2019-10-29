package edu.usst.collection;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/10/29
 * Time: 14:25
 * Description: Iterable是Collection父接口 Iterable接口中包含forEach(Consumer action)方法
 * 使用Lambda表达式遍历集合
 */
public class CollectionEach {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("万般滋味都是生活");
        books.add("世界观");
        books.forEach(o -> System.out.println("迭代集合元素：" + o));
    }
}
