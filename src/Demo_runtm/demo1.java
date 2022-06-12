package Demo_runtm;

public class demo1{
    public static void main(String[] args) throws Exception {
       Runtime rtmp = Runtime.getRuntime ();
       System.out.println("虚拟机的处理器数量:"+rtmp.availableProcessors ()+"个");
       System.out.println("ava虚拟机中的空闲内存量"+rtmp.freeMemory ()/1024/1024+"M");
        System.out.println("ava虚拟机最大可用内存量:"+rtmp.maxMemory()/1024/1024/1024 + "G");
        System.out.println("ava虚拟机中的内存总量:"+rtmp.totalMemory ()/1024/1024+"M");
    }
}
