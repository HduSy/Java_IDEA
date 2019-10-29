package edu.usst.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/10/22
 * Time: 10:56
 * Description: To change this template use File | Settings | File and Code Templates.
 */
public class KeyinTest {
    public static void main(String[] args) {
//        键盘输入字节流转字符流
//        BufferedReader包装Reader便于操作
        try (InputStreamReader reader = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(reader)) {
            String line = null;
            while ((line = br.readLine()) != null) {
                if (line.equals("exit")) {
                    System.exit(1);
                }
                System.out.println("输入内容为：" + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
