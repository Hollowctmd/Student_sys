package Demo_Test4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class demo_io1 {
    public static void main(String[] args) throws Exception{
        BufferedInputStream bis = new BufferedInputStream (new FileInputStream ("source/aa.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream (new FileOutputStream ("source/bb.mp4"));
        int len = 0;
        byte[] bytes = new byte[2048];
        long beging = System.currentTimeMillis();
        while((len=bis.read(bytes)) !=-1) {
            bos.write(bytes, 0, len);
        }
        long beging2 = System.currentTimeMillis();

//        String str = "gdshjjs";
//        fis1.write(str.getBytes ());
//        fis1.close();
        System.out.println ("花了："+(beging2-beging)+"毫秒");
        bis.close();
        bos.close();
    }
}
