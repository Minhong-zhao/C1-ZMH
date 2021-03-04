import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task9 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\csatest\\demo.txt");
        File fileparent = new File("C:\\castest2");
        fileparent.mkdirs();
        File file = new File("C:" + File.separator + "castest2" + File.separator + "demo2.txt");
        if (file.exists()) {
            file.createNewFile();
            System.out.println("文件创建成功");
        } else {
            System.out.println("文件已经创建");
        }
        FileOutputStream fos = new FileOutputStream("C:\\castest2\\demo2.txt");
        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.println(len);
            fos.write(len);
        }
        fis.close();
        fos.close();
    }
}