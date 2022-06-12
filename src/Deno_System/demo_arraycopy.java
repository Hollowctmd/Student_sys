package Deno_System;

public class demo_arraycopy {
    public static void main(String[] args) {
        int[] srcArray = {1024,1523,1765,1792,1348,1235};  //源数组
        int[] destArray = {5873,5238,5892,5295,5629}; //目标数组
        System.arraycopy (srcArray,1,destArray,1,4);
        for (int i = 0; i < destArray.length; i++) {
            System.out.println(i+"."+destArray[i]);
        }

    }
}
