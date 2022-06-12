package Demo_Test2;

import java.util.Random;
import java.util.Scanner;

class demo_ramd {
    static void ramd() {
        int key;    //随机数
        int write; //键值对
        int i;
        char contu;    //判断
        Random ram = new Random ();
        Scanner sc = new Scanner (System.in);
            i = 3;
            while (i >= 1) {
                key = ram.nextInt (5);
                System.out.println ("请输入0-5的数：");
                write = sc.nextInt ();

                if (write == key) {
                    System.out.println ("恭喜猜中了没有奖励");
                    break;
                } else {

                    if (write > key) {
                        System.out.println ("猜大了");
                    } else {
                        System.out.println ("猜小了");
                    }

                }
                i--;
                System.out.println ("还有" + i + "次机会");
            }


    }
}