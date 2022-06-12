package Demo_Test;

interface Shape {   //接口
    double area(double value);  //抽象方法
}

class Square implements Shape{  //子类1继承父类接口
    static int s=4;
    @Override
    public double area(double sl) { //实现父类抽象方法1

        return sl*sl;
    }
    public void game(){
        System.out.println("该类型是Square");
    }
    static class Intes{     //内部静态类
        void test(){
            System.out.println("这是静态内部类-外部静态变量："+s);
        }
    }
}
class Circle implements  Shape{     //子类2继承父类接口
    private int a=0;
    @Override
    public double area(double r) {  //实现父类抽象方法2

        return Math.PI*r*r;
    }
    private void test1(){   //创建子类方法test1
        class Inner{       //局部类
            int b =3;
            public void show(){
                System.out.println("这是外部局部类-外部类变量："+a);
            }

        }
        Inner ins =new Inner();     //方法内，创建局部类对象
        System.out.println("调用了外部的局部类-变量为："+ins.b);
        ins.show(); //调用局部方法

    }

    class Outer{    //成员内部类
        int m =1;
        public void show1(){    //调用外部方法
            System.out.println("内部类调用了外部类-外部类变量为："+a);
            test1();
        }
        public void show2(){
            System.out.println("这是内部类");
        }
    }
    void test2(){       //调用成员内部类方法
        Outer oo = new Outer();
        System.out.println("外部类调用了内部类-内部类变量为："+oo.m);
        oo.show1();
    }
}
