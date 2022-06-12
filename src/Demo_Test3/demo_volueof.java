package Demo_Test3;

public class demo_volueof {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        for(int i=0;i<n;i++){
            for (int j = 0;j < m;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }



        int num = 2;
        //通过String.volueof()方法将8种基本数据（Byte,Character,Integer,Short,Long,Float,Double,Boolean）类型转换为字符串
        String string = String.valueOf(num);
        System.out.println("将int类型转换为字符串类型为："+string);
        //通过包装类valu的静态方法将基本数据类型转换为包装类
        String str ="998";
        Integer intnum = Integer.valueOf(num);
        Integer intStr = Integer.valueOf(str);
        System.out.println("将int类型转换为包装类的结果"+intnum);
        System.out.println("将String类型转换为包装类的结果"+intStr);
        //通过包装类的有参构造方法将基本的数据类型和字符串转换为包装类
        Integer intnums = new Integer(num);
        Integer intStrs = new Integer(str);
        System.out.println("通过构造器将int转换为包装类的结果："+intnums);
        System.out.println("通过构造器将int转换为包装类的结果："+intStrs);
        //通过包装类parseXxx()静态方法将字符串转换为基本数据类型
        Integer integer = Integer.parseInt(str);
        System.out.println("将字符串转换为基本数据类型结果："+integer);
        //通过包装类的toString将包装类转换为字符串
        String stirng = intnums.toString();
        System.out.println("将包装类装换为字符串结果："+stirng);
    }
}
