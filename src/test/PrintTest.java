package test;

import edu.usst.trek.interfaces.InterFaceB;
import edu.usst.trek.interfaces.InterfaceA;
import edu.usst.trek.src.Print;

public class PrintTest {
    public static void main(String[] args) {
        InterfaceA a = new Print();
        a.printCapitalLetter();
        InterFaceB b = new Print();
        b.printLowercaseLetter();
    }
}
