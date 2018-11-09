import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 测试 队列
 */
public class QueueMain {
    public static void main(String[] args) {
        BlockingQueue<Object> queue = new LinkedBlockingDeque<Object>();//创建没有指定容量的阻塞队列
        BlockingQueue<Object> queue2 = new LinkedBlockingDeque<Object>(10);//创建指定容量为10的阻塞队列
        try{
            for (int i = 0; i <15 ; i++) {
                //queue.add(i);
               queue2.add(i);
                System.out.println("size:[]"+queue2.size());
                System.out.println("取值：【】"+queue2.poll());//取值后值不在队列
                //System.out.println("取值：【】"+queue2.peek());//取值后值还在队列

            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("queue add element fail！");
        }
    }
}

