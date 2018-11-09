import java.util.concurrent.*;

public class ThreadPoolMain {
    public static void main(String[] args) {
        ThreadPoolExecutor excutor = new ThreadPoolExecutor(5,10,200, TimeUnit.MILLISECONDS,new ArrayBlockingQueue<Runnable>(5));
        ExecutorService executorService = Executors.newCachedThreadPool();

     /*   for(int i=0;i<15;i++){
            MyTask myTask = new MyTask(i);
            excutor.execute(myTask);
            System.out.println("线程池中线程数目："+excutor.getPoolSize()+"，队列中等待执行的任务数目："+
                    excutor.getQueue().size()+"，已执行玩别的任务数目："+excutor.getCompletedTaskCount());
        }*/
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        Thread t1 =  new Thread(threadDemo1,"窗口①");
        Thread t2 =  new Thread(threadDemo1,"窗口②");
        Thread t3 =  new Thread(threadDemo1,"窗口③");
        Thread t4 =  new Thread(threadDemo1,"窗口④");
        Thread t5 =  new Thread(threadDemo1,"窗口⑤");
        for (int i = 0; i <=50 ; i++) {
            Thread thread =  new Thread(threadDemo1,"窗口①");
        }
        excutor.execute(t1);
        excutor.execute(t2);
        excutor.execute(t3);
        excutor.execute(t4);
        excutor.execute(t5);

        excutor.shutdown();
    }


}
class MyTask implements Runnable {
    private int taskNum;

    public MyTask(int num) {
        this.taskNum = num;
    }

    @Override
    public void run() {
        System.out.println("正在执行task "+taskNum);
        try {
            Thread.currentThread().sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task "+taskNum+"执行完毕");
    }
}
