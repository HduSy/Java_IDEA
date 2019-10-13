package edu.usst.thread;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/10/13
 * Time: 9:54
 * Description: To change this template use File | Settings | File and Code Templates.
 */
public class SecondThread implements Runnable {
    private int i;

    @Override
    public void run() {
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20){
                SecondThread secondThread = new SecondThread();
                new Thread(secondThread,"Thread-1").start();
                new Thread(secondThread,"Thread-2").start();
            }
        }
    }
}
