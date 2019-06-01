package edu.usst.trek.src;

import edu.usst.trek.interfaces.InterFaceB;
import edu.usst.trek.interfaces.InterfaceA;

public class Print implements InterfaceA, InterFaceB {
    @Override
    public void printLowercaseLetter() {
        char[] chr = new char[26];
        int i = 65;
        for (int j = 0; j < 26; j++) {
            chr[j] = (char) i;
            i++;
        }
        System.out.println("大写字母:");
        for(char tem:chr){
            System.out.println(tem);
        }
        System.out.println();
    }

    @Override
    public void printCapitalLetter() {
        char[] chr = new char[26];
        int i=97;
        for (int j = 0; j < 26; j++) {
            chr[j] = (char) i;
            i++;
        }
        System.out.println("小写字母");
        for (char tmp:chr){
            System.out.println(tmp);
        }
        System.out.println();
    }
}
