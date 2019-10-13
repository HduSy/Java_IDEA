package edu.usst.thread;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/10/13
 * Time: 9:46
 * Description: To change this template use File | Settings | File and Code Templates.
 */
public class FirstThread extends Thread {
    private int i;

    @Override
    public void run() {
        for (; i < 100; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                new FirstThread().start();
                new FirstThread().start();
            }
        }
    }
}
