package Demo_deadlock;

class DeadlockThread implements Runnable {
    static Object Chopstickslock = new Object ();
    static Object knifelock = new Object ();
    static Object deadlock = new Object ();
    private boolean flag;

    DeadlockThread(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized(deadlock) {
                synchronized (Chopstickslock) {
                    System.out.println (Thread.currentThread ().getName () + "得到筷子");
                    synchronized (knifelock) {
                        System.out.println (Thread.currentThread ().getName () + "得到刀叉");
                    }
                }
            }
        } else {
            synchronized(deadlock) {
                synchronized (knifelock) {
                    System.out.println (Thread.currentThread ().getName () + "得到刀叉");
                    synchronized (Chopstickslock) {
                        System.out.println (Thread.currentThread ().getName () + "得到筷子");
                    }
                }
            }

        }
    }
}
