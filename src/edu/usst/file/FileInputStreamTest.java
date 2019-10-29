package edu.usst.file;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/10/22
 * Time: 10:19
 * Description: To change this template use File | Settings | File and Code Templates.
 */
public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Program Files (x86)\\IdeaProjects\\Trek\\src\\edu\\usst\\file\\FileInputStreamTest.java");
        byte[] bbuf = new byte[1024];
        int hasRead = 0;
        while ((hasRead = fis.read(bbuf))>0){
            System.out.println(new String(bbuf,0,hasRead));
        }
        fis.close();
    }
}
