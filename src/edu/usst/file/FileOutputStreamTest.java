package edu.usst.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/10/22
 * Time: 10:28
 * Description: To change this template use File | Settings | File and Code Templates.
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("D:\\Program Files (x86)\\IdeaProjects\\Trek\\src\\edu\\usst\\file\\FileInputStreamTest.java");
                FileOutputStream fos = new FileOutputStream("newFile.txt")) {
            byte[] bbuf = new byte[32];
            int hasRead = 0;
            while ((hasRead = fis.read(bbuf)) > 0) {
                fos.write(bbuf, 0, hasRead);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
