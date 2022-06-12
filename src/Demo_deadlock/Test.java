package Demo_deadlock;

public class Test {
    public static void main(String[] args) {
        DeadlockThread deadlockThread = new DeadlockThread(true);
        DeadlockThread deadlockThread1 = new DeadlockThread(false);
        new Thread(deadlockThread,"chinese").start ();
        new Thread(deadlockThread1,"foreign").start ();
    }
}
