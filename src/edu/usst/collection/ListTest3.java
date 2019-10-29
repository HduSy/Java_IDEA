package edu.usst.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/10/29
 * Time: 16:07
 * Description: To change this template use File | Settings | File and Code Templates.
 */
public class ListTest3 {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new String("万般滋味都是生活"));
        books.add(new String("世界观"));
        books.add("算法笔记");
        books.sort((ele1,ele2)->((String)ele1).length()-((String)ele2).length());
        System.out.println(books);
        books.replaceAll(ele->((String)ele).length());
        System.out.println(books);
    }
}
