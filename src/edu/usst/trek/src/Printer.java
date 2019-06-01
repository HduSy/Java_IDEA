package edu.usst.trek.src;


import edu.usst.trek.interfaces.OutPut;
import edu.usst.trek.interfaces.Product;

public class Printer implements Product, OutPut {

    private String[] printData = new String[MAX_CACHE_LINE];
    private int dataNum = 0;

    @Override
    public int getProduceTime() {
        return 45;
    }

    @Override
    public void out() {
        while (dataNum > 0) {
            System.out.println("打印机打印" + printData[0]);
            System.arraycopy(printData, 1, printData, 0, --dataNum);
        }
    }

    @Override
    public void getData(String msg) {
        if (dataNum>MAX_CACHE_LINE){
            System.out.println("输出队列已满，添加失败");
        }else {
            printData[dataNum++] = msg;
        }
    }

    public static void main(String[] args) {
        OutPut o = new Printer();
        o.getData("疯狂java讲义");
        o.getData("疯狂Android讲义");
        o.out();
        o.print("A","B","C");
        o.test();
        Product p = new Printer();
        System.out.println(p.getProduceTime());
    }
}
