import java.io.FileInputStream;
import java.io.IOException;

public class Task8 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\csatest\\demo.txt");
        int len = 0, i = 0;
        //注意不能使用如下方法来遍历,原因是如果进入循环时进行一次读取（不输出），再在循环内部进行一次读取（输出）
//        while(fis.read()!=-1){
//            System.out.println((char)len);
//        }
        while ((len = fis.read()) != -1) {
            System.out.print((char) len);
            if ((char) len == '0') {
                i++;
            }
        }
        fis.close();
        System.out.println("2021的个数为:" + i);
    }
}