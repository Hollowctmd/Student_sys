package demo1;

interface Animal {

    int ID=1;    //定义全局常量

    void breathe();  //定义抽象方法
    //定义一个默认方法
    default void getType(String type) {

        System.out.println("该动物属于："+type);
    }
    //定义一个静态方法
    static int getID(){

        return ID;
    }



}
//Dog类实现了Animal接口
class Dog implements Animal {

    public  void breathe(){
        System.out.println("呼吸");
    }

    @Override
    public void getType(String type) {
        Animal.super.getType (type);
    }
}


public class Testdemo {

    public static void main(String[] args) {
        System.out.println(Animal.getID ());
        Dog dog = new Dog();
        dog.breathe ();
        dog.getType ("犬科");
    }
}