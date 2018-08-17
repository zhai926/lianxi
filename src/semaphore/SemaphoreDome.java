package semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 *  模拟窗口买票
 * Created by zhaihuilin on 2018/7/31 14:08.
 */
public class SemaphoreDome {

    // 内部类
    class  MyRunnale implements  Runnable{
      private  int user;  //用户

      private Semaphore semaphore; // 信号量 [资源】



      public MyRunnale(int user, Semaphore semaphore) {
        this.user = user;
        this.semaphore = semaphore;
      }

      @Override
      public void run() {
           try {
             semaphore.acquire(); // 获取信号量许可

             System.out.println("用户【"+user+"】进入 窗口，准备买票");

             Thread.sleep((long) Math.random() * 10000);

             System.out.println("用户【"+user+"】买完票，即将离开");

             Thread.sleep((long) Math.random()* 10000);

             System.out.println("用户【"+user+"】离开,释放了 窗口");

             //释放信号量
             semaphore.release();

           }catch (Exception e){
             e.printStackTrace();
           }
      }
    }

    // 执行任务
    public  void  MyTask(){
        Semaphore semaphore =new Semaphore(2);
        ExecutorService executorService= Executors.newCachedThreadPool(); // 开启线程池
         // 模拟 20个线程 【人】
         for (int i= 0; i<20; i++){
           executorService.execute(new MyRunnale(i+1,semaphore));
         }
           executorService.shutdown();
    }


  public static void main(String[] args) {
    SemaphoreDome  semaphoreDome = new SemaphoreDome();

    semaphoreDome.MyTask();
  }


}
