/**
 * 模拟两个窗口同时卖票，出现线程安全问题及解决方法
 * synchronized 的使用（锁机制）
 *
 */
public class ThreadDemo1 implements Runnable {
    private int count = 100;
    Object oj = new Object();
    Boolean flag = true;

    public void run(){

            while (count > 0) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(flag) {
                    sale();
                    flag=false;
                }else{
                    sale2();
                    flag=true;
                }

                count--;

        }
    }

    public  synchronized void  sale() {
            if (count>0) {
                System.out.println("ThreadName=" + Thread.currentThread().getName() + ",\t 出售第[" + (100 - count + 1) + "]张票");
            }
    }

    public   void  sale2() {
         synchronized(oj){
        if (count>0) {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + ",\t 出售第[" + (100 - count + 1) + "]张票");
            }
          }

    }
}
