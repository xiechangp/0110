import java.io.File;

public class Scsymu {
    public static void main(String[] args) {
        File file = new File("F:\\a");
        showFile(file);
    }
    /*
    递归：方法调用是在栈中进行
    1、堆栈
    2、回归
    递归就是自己调用自己
     */
    public static void showFile(File file) {
        if(file.isDirectory()) {    //出口
            File files[] = file.listFiles();
            for (File f: files) {
                //开始递归
                showFile(f);
            }
            } else {
            System.out.println(file.getName());
        }
    }
}
