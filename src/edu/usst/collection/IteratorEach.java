package edu.usst.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/10/29
 * Time: 14:39
 * Description: Lambda表达式遍历Iterator
 */
public class IteratorEach {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("万般滋味都是生活");
        books.add("世界观");
        Iterator it = books.iterator();
        it.forEachRemaining(o -> System.out.println("迭代集合元素：" + o));
    }
}
