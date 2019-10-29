package edu.usst.collection;

import java.util.stream.IntStream;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/10/29
 * Time: 15:14
 * Description: 流式API
 */
public class IntStreamTest {
    public static void main(String[] args) {
        IntStream is = IntStream.builder()
                .add(20)
                .add(13)
                .add(-2)
                .add(18)
                .build();
//        末端方法 执行末端方法后该流将会被“消耗”，不再可用
        System.out.println("is所有元素的最大值为：" + is.max().getAsInt());
        System.out.println("is所有元素的最小值为：" + is.min().getAsInt());
        System.out.println("is所有元素的总和为：" + is.sum());
        System.out.println("is左右元素的总数为：" + is.count());
        System.out.println("is所有元素平均值：" + is.average());
        System.out.println("is所有元素的平方是否都大于20：" + is.allMatch(ele -> ele * ele > 20));
        System.out.println("is是否包含元素平方大于20：" + is.anyMatch(ele -> ele * ele > 20));
//        中间方法 保持流打开状态
        IntStream newIs = is.map(ele -> ele * 2 + 1);
        newIs.forEach(System.out::println);
    }
}
