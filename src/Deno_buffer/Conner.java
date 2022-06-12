package Deno_buffer;

import java.util.Scanner;

public class Conner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一段字符");
        String s= input.nextLine ();    //将输入的字符存入s
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);   //
            if (c>48&&c<58) {
                sb.append(c);
            }else {
                if (c <=127) {
                    sb1.append(c);
                }else {
                    sb2.append(c);
                }
            }
        }
        System.out.println("数字字符有"+sb+"----长度为"+sb.length ());
        System.out.println("西文字符有"+sb1+"----长度为"+sb1.length ());
        System.out.println("汉字或其它字符有"+sb2+"----长度为"+sb2.length ());
    }
}
