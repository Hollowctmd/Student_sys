package Demo_Test5;

public class Test {
    public static void main(String[] args) {
        MyThread thread = new MyThread ("线程1");
        thread.start();
        MyThread thread1 = new MyThread ("线程2");
        thread1.start();
    }
}
