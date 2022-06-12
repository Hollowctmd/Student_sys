package Demo_Test4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class demo_io {
    public static void main(String[] args) throws Exception {
        //创建一个文件字节输入流来读取文件
        FileInputStream fis = new FileInputStream("source/bb.mp4");
        FileOutputStream fis1 = new FileOutputStream("source/aa.mp4");
        int b = 0;
        byte[] bytes = new byte[2048];
        long beging = System.currentTimeMillis();
        while((b=fis.read(bytes)) !=-1) {
            fis1.write(bytes, 0, b);
        }
        long beging2 = System.currentTimeMillis();

//        String str = "gdshjjs";
//        fis1.write(str.getBytes ());
//        fis1.close();
        System.out.println ("花了："+(beging2-beging)+"毫秒");
        fis.close();
        fis1.close();
    }
}
