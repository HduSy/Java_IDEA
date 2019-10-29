package edu.usst.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/10/29
 * Time: 14:53
 * Description: To change this template use File | Settings | File and Code Templates.
 */
public class PredictTest2 {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("万般滋味都是生活");
        books.add("世界观");
        System.out.println(calAll(books, o -> ((String) o).contains("世界观")));
        System.out.println(calAll(books, o -> ((String) o).length() > 3));
        System.out.println("books集合的元素为："+books);
    }

    public static int calAll(Collection books, Predicate p) {
        int total = 0;
        for (Object o : books) {
            if (p.test(o)) {
                total++;
            }
        }
        return total;
    }
}
