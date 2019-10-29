package edu.usst.collection;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/10/29
 * Time: 14:42
 * Description: To change this template use File | Settings | File and Code Templates.
 */
public class ForeachTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("万般滋味都是生活");
        books.add("世界观");
        for (Object o: books){
            String book = (String) o;
            System.out.println("迭代集合元素："+book);
            if (book.equals("世界观")){
                books.remove(book);
            }
        }
        System.out.println(books);
    }
}
