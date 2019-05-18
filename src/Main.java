import java.util.ArrayList;

/**
 * Created by Usst_Yao.
 * Author: Usst_Yao
 * Date: 2019/5/18
 * Time: 16:31
 * Description: To change this template use File | Settings | File and Code Templates.
 */
public class Main {
//    prsf psf psfi psfs
    private static final Stu stu = new Stu();
    public static final int INITIALSIZE = 10;
    private static ArrayList list;
    public static void main(String[] args) {
        System.out.println("中文不乱吗");
        show();
        System.out.println(stu.getUsrname());
        System.out.println(stu.getPassword());
    }
    public static void show() {
        list = new ArrayList();
        list.add(0, 12);
        list.add(1,24);
//        list.fori
        for (int i = 0; i < list.size(); i++) {

        }
//        list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }
//        ifn
        if (list == null) {
            System.out.println("list为null");
        }
//        inn
        if (list != null) {

        }
        String[] arr = new String[]{"Tom","Jerry"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Main.show");
    }
}

