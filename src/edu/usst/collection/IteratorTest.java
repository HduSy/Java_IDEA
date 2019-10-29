package edu.usst.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/10/29
 * Time: 14:34
 * Description: Java8增强的Iterator遍历集合元素，依附于Collection对象
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("万般滋味都是生活");
        books.add("世界观");
        Iterator it = books.iterator();
        while (it.hasNext()){
            String bookName = (String) it.next();
            System.out.println("《"+bookName+"》");
            if (bookName.equals("世界观")){
                it.remove();
            }
            bookName = "测试字符串";
        }
        System.out.println(books);
    }
}
