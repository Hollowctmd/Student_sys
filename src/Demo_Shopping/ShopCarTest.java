package Demo_Shopping;

import java.util.Scanner;

public class ShopCarTest {
    public static void main(String[] args) {
        Shops[] shopCar = new Shops[100];
        while (true) {

            System.out.println ("请选择以下命令操作\n1-增加\n2-查看\n3-修改\n4-结算");
            Scanner input = new Scanner (System.in);
            System.out.println ("请输入命令");
            String command= input.next();
            switch(command){
                case "1":
                    //增加
                    addshops(shopCar,input);
                    break;
                case "2":
                    //查看
                    quershops(shopCar);
                    break;
                case "3":
                    //修改
                    updateshops(shopCar);
                    break;
                case "4":
                    //结算金额
                    payshops(shopCar);
                    break;


            }

        }
    }

    private static void payshops(Shops[] shopCar) {
    }

    private static void updateshops(Shops[] shopCar) {
    }

    private static void quershops(Shops[] shopCar) {
        System.out.println ("=======查看商品======");
        System.out.println ("编号\t\t名称\t\t\t价格\t\t\t数量");
        for (int i = 0; i < shopCar.length; i++) {
           Shops shops = shopCar[i];
           if (shops!=null){
               System.out.println (shops.id+"\t\t"+shops.name+"\t\t\t"+shops.price+"\t\t"+shops.buyNumber);
           }else
               break;
             }
    }

    private static void addshops(Shops[] shopCar, Scanner input) {
        System.out.println ("输入编号（唯一）");
        int id = input.nextInt();
        System.out.println ("输入商品名称");
        String name =input.next();
        System.out.println ("输入商品金额");
        double price = input.nextDouble();
        System.out.println ("输入数量");
        int buyNumber = input.nextInt();

        Shops shops = new Shops();
        shops.id=id;
        shops.name = name;
        shops.price = price;
        shops.buyNumber = buyNumber;

        for (int i = 0; i < shopCar.length;i++) {
            if (shopCar[i]==null) {
                shopCar[i]=shops;
                break;
            }
        }
        System.out.println ("商品添加完成");

    }
}
