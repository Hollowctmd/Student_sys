package Demo_Test2;

import java.util.Random;
import java.util.Scanner;

public class demo_random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一组随机数：");
        int n =scanner.nextInt();
        System.out.println("请输入第二组随机数：");
        int m =scanner.nextInt();
        for (int i = 0;i<5;i++){
            System.out.println(n+(new Random()).nextInt(m-n+1));//【0-10】之间不包括10
        }
    }
}
