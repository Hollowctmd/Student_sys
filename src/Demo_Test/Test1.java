package Demo_Test;

public class Test1 {
    public static void main(String[] args) {
        /**定义匿名内部类作为参数传递给animalShout()方法
         *
         */
        String name ="阿猫阿狗";

        /**这是类继承接口测试
         *
         */
        Shape sq = new Square();    //创建对象多态
        Shape cc = new Circle();
            if(sq instanceof Square){       //判断sq的本质是否匹配
                Square sa = (Square)sq;
                    sa.game();
            }else {
                System.out.println("该类型的对象不是Square");
            }
        System.out.println("正方形的体积为"+sq.area(2));
        System.out.println("圆的体积为"+cc.area(3));
        /**这是成员内部类测试
         *
         */
        Circle cd=(Circle)cc;       //由于上方Circle的变量类型为父类这里强制转换为同类型变量
        Circle.Outer co = cd.new Outer();   //创建内部类对象
        co.show1();     //测试内部调用外部成员方法及变量   --同时调用了 test1
        co.show2();     //测试调用内部方法
        cd.test2();     //测试外部调用内部成员方法及变量

        Square.Intes ints = new Square.Intes(); //创建静态类对象
        ints.test();

        animalShout(sh -> sh + sh / 3);
        animalShout(new Shape() {
            @Override
            public double area(double sh) {
                return sh + sh / 2;
            }
        });
    }

    /**定义静态方法，接收接口类型参数
     *
     * @param sp
     */
    public static void animalShout(Shape sp){

        System.out.println("不知道什么体积-就是测试匿名内部类"+sp.area(5));
    }
}
