package edu.usst.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/10/29
 * Time: 16:11
 * Description: To change this template use File | Settings | File and Code Templates.
 */
public class ListItetatorTest {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new String("万般滋味都是生活"));
        books.add(new String("世界观"));
        books.add("算法笔记");
        ListIterator li = books.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
            li.add("-----分隔符-----");
        }
        System.out.println("=====下面开始反向迭代=====");
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
