/**
 * 模拟死锁状态
 *
 *
 */
public class ThreadDemo2 implements Runnable {
    private int count = 100;
    private Object oj = new Object();
    Boolean flag = true;
   public void run(){
           if(flag) {
               while (true) {
                   synchronized (oj) {
                       sale2();
                   }
               }
           }else{
               while(true)
                   sale2();
               }
           }



    public  synchronized void  sale2() {
                System.out.println("ThreadName=" + Thread.currentThread().getName() + ",\t 出售第[" + (100 - count + 1) + "]张票");
        }
    }

