package edu.usst.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/10/22
 * Time: 10:45
 * Description: To change this template use File | Settings | File and Code Templates.
 */
public class PrintStreamTest {
    public static void main(String[] args) {
        try (
                FileOutputStream fos = new FileOutputStream("test.txt");
                PrintStream ps = new PrintStream(fos);
        ) {
            ps.println("普通字符串");
            ps.println(new PrintStreamTest());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
