public class Main {

    public static void main(String[] args) {
     /*   System.out.println("Hello World!");
        ThreadDemo1 threadDemo1 = new ThreadDemo1();

        Thread t1 =  new Thread(threadDemo1,"窗口①");
        Thread t2 =  new Thread(threadDemo1,"窗口②");

        t1.start();
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();*/

        System.out.println("Hello World!");
        ThreadDemo1 threadDemo1 = new ThreadDemo1();

        Thread t1 =  new Thread(threadDemo1,"窗口①");
        Thread t2 =  new Thread(threadDemo1,"窗口②");

        t1.start();
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

    }
}
