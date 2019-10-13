package edu.usst.trek.src;

import edu.usst.trek.interfaces.Commond;

public class PrintCommand implements Commond {

    @Override
    public void process(int[] array) {
        for (int tmp:array){
            System.out.println("迭代输出数组元素："+tmp);
        }
    }
}
