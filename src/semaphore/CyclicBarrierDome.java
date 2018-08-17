package semaphore;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 模拟公司聚餐吃饭
 * CyclicBarrier 的字面意思是可循环使用（Cyclic）的屏障（Barrier）。它要做的事情是，让一组线程到达一个屏障（也可以叫同步点）时被阻塞，
 * 直到最后一个线程到达屏障时，屏障才会开门，所有被屏障拦截的线程才会继续干活。CyclicBarrier默认的构造方法是CyclicBarrier(int parties)，
 * 其参数表示屏障拦截的线程数量，每个线程调用await方法告诉CyclicBarrier我已经到达了屏障，然后当前线程被阻塞。
 *
 * CyclicBarrier 可循环的屏障
 * * Created by zhaihuilin on 2018/7/31 14:36.
 */
public class CyclicBarrierDome {


  public static void main(String[] args) {
    final CyclicBarrier cyclicBarrier  =new CyclicBarrier(3, new Runnable() {
      @Override
      public void run() {
        System.out.println("吃饭之前拍照");
      }
    });// 模拟 8个 人

    ExecutorService executorService= Executors.newCachedThreadPool(); // 开启线程池

    // 开启 8个线程
    for (int i= 0; i<3; i++){
        final  int  user = i+1;
         Runnable runnable =new Runnable() {
          @Override
          public void run() {
              try {
                Thread.sleep((long)(Math.random() * 10000));
                System.out.println(user + "已经到到达聚餐地点" + ",在他之前有" +(cyclicBarrier.getNumberWaiting())+ "人到达");

                cyclicBarrier.await();// 在人员没全部到齐之前 ，让到的人等待 【阻塞点】


                System.out.println("人员全部到齐,开始吃饭");

                Thread.sleep((long)(Math.random() * 10000));

                System.out.println(user + "已经出完饭，准备离开");


                // 然后 去 到 某地方 唱歌
                Thread.sleep((long)(Math.random() * 10000));
                System.out.println(user + "已经到到达ktv地点" + ",在他之前有" +(cyclicBarrier.getNumberWaiting())+ "人到达");

                cyclicBarrier.await();// 在人员没全部到齐之前 ，让到的人等待 【阻塞点】


                System.out.println("人员全部到齐,开始唱歌");

                Thread.sleep((long)(Math.random() * 10000));

                System.out.println(user + "已经唱完歌，准备离开");

              }catch (Exception e){
                 e.printStackTrace();
              }
          }


        };
      executorService.execute(runnable);
    }

    executorService.shutdown();
  }




}
