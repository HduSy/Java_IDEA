package test;

import edu.usst.trek.interfaces.Commond;
import edu.usst.trek.src.AddCommand;
import edu.usst.trek.src.PrintCommand;

public class CommandTest {
    public static void main(String[] args) {
        ProcessArray pa = new ProcessArray();
        int[] target = {3, -4, 6, 4};
        pa.process(target, new PrintCommand());
        System.out.println("-------------------------");
        pa.process(target, new AddCommand());
        //处理数组，具体处理行为取决于匿名内部类
        pa.process(target, new Commond() {
            @Override
            public void process(int[] array) {
                for (int item : array) {
                    System.out.print("匿名内类-迭代输出数组元素加一 ");
                    System.out.println(item + 1);
                }
            }
        });
        System.out.println("-------------------------");
        pa.process(target,(int[] array)->{
            int sum = 0;
            for (int itm:array){
                sum+=itm;
            }
            System.out.println("Lambda表达式输出数组和："+sum);
        });
    }
}
