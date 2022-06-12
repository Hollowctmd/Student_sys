package Demo_Test5;

class Thread2 implements Runnable{
    //重写Runnable接口的run方法
    public void run() {
        int i = 0;
        while (i++ < 5) {
            System.out.println (Thread.currentThread ().getName () + "的run方法在运行");
        }
    }
}
