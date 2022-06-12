package Demo_Test2;

import java.util.Random;
import java.util.Scanner;

class demo_random2 {
    String str = "qwertyuiopasdfghjklzxcvbnm7894561230QWERTYYUIOPASDFGHJKLZXCVBNM";
    boolean verification() {

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int c;
        char k;
        for (int i = 0; i < 4; i++) {//遍历4次
            c = random.nextInt(str.length());//获取str长度的随机数下标
            //获取下表中的值
            k = str.charAt(c);
            sb.append(k);   //使用append方法给sb插入数据

        }
        System.out.println("验证码为：" + sb);
        System.out.print("请您输入验证码：");
        int i = 3;
        while (i >= 1) {
            String str1 = input.nextLine();
            if (str1.equals(sb.toString())) {
                return true;
            } else {
                if(i<=3&&i>1) {
                    System.out.println ("还有" + ( i - 1 ) + "次机会");
                    System.out.print ("请您再次输入验证码：");
                }else{
                    System.out.println("没有次数");
                }
            }
        i--;
        }
        return false;
    }
}
