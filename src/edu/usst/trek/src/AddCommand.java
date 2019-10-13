package edu.usst.trek.src;

import edu.usst.trek.interfaces.Commond;

public class AddCommand implements Commond {

    @Override
    public void process(int[] array) {
        int sum = 0;
        for (int tmp:array){
            sum+=tmp;
        }
        System.out.println("数组元素总和为："+sum);
    }
}
