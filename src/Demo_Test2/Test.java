package Demo_Test2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        demo_random2 random = new demo_random2();
        Boolean blic = true;
        int contion =0;
       do {
           if (contion == 3) {
               blic=random.verification ();
               contion = 0;
           }
           if(blic){
               demo_ramd.ramd ();
               System.out.println("是否继续-按1继续，其他退出");
               contion++;
           }else
               break;

       }while (input.nextInt ()==1);
    }
}
