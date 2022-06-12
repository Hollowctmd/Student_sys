package Demo_runtm;

public class demo2 {
    public static void main(String[] args) throws Exception {
       Runtime runtime =  Runtime.getRuntime ();
       Process proces = runtime.exec ("notepad.exe");
       Thread.sleep (3000);
       proces.destroy ();
    }
}
