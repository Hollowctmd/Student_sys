package Demo_Test5;


    //定义一个继承Thread线程的子类
     class MyThread extends Thread {
        //创建子线程类有参构造方法
        public MyThread(String name) {

            super (name);
        }

        //重写Thread类的run方法
        public void run() {
            int i = 0;
            while (i++ < 5) {
                System.out.println (Thread.currentThread ().getName () + "的run方法在运行");
            }
        }
    }



