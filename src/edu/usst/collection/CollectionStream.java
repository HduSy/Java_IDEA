package edu.usst.collection;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/10/29
 * Time: 15:29
 * Description: Java8 流式API操作Collection
 */
public class CollectionStream {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("万般滋味都是生活");
        books.add("世界观");
//        中间方法的返回值是另一个流
        System.out.println(books.stream().filter(o -> ((String) o).contains("世界观")).count());
        books.stream().mapToInt(ele -> ((String) ele).length()).forEach(System.out::println);
    }
}
