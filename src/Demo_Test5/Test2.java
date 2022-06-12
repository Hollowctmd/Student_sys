package Demo_Test5;

public class Test2 {
    public static void main(String[] args) {
        Thread2 Mythread2 = new Thread2();
        Thread thread1 = new Thread(Mythread2,"thread1");
        thread1.start ();
        Thread thread2 = new Thread(Mythread2,"thread2");
        thread2.start();
    }
}
