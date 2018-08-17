package semaphore;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * Created by zhaihuilin on 2018/7/31 16:03.
 */
public class CountDownLatchDome {

  //public static void main(String[] args) {
  //  ExecutorService executorService= Executors.newCachedThreadPool();
  //  final CountDownLatch countDownLatch =new CountDownLatch(3);// 三个线程 【三个运动员】
  //  final CountDownLatch countDownLatchOrder = new CountDownLatch(1); // 裁判
  //
  //  for (int i = 0 ; i< 3; i++){
  //        final  int user = i+1;
  //        Runnable runnable = new Runnable() {
  //          @Override
  //          public void run() {
  //            try {
  //              System.out.println("【" +user+ "】正在接受命令....");
  //              countDownLatchOrder.await();  // 裁判要等到所以人到齐后
  //
  //              Thread.sleep((long)(Math.random() * 10000));
  //              System.out.println("【" +user+ "】已接受命令....");
  //
  //              Thread.sleep((long)(Math.random() * 10000));
  //              System.out.println("【" +user+ "】在等待响应结果....");
  //
  //              countDownLatch.countDown(); //等到所以运动员都跑完 【 -1 】
  //
  //            }catch (Exception e){
  //               e.printStackTrace();
  //            }
  //          }
  //        };
  //        executorService.execute(runnable);
  //  }
  //
  //  try {
  //    Thread.sleep((long)(Math.random() * 10000));
  //    System.out.println("裁判即将发布命令.......");
  //    countDownLatchOrder.countDown();
  //
  //    System.out.println("裁判已经发布命令.......");
  //    countDownLatch.await();
  //
  //    System.out.println("已经收到相应结果....");
  //
  //  }catch (Exception e){
  //     e.printStackTrace();
  //  }
  //
  //  executorService.shutdown();
  //
  //}


  public static void main(String[] args) {
    ExecutorService service = Executors.newCachedThreadPool();
    final CountDownLatch cdOrder = new CountDownLatch(1);
    final CountDownLatch cdAnswer = new CountDownLatch(3);
    for(int i=0;i<3;i++){
      Runnable runnable = new Runnable(){
        public void run(){
          try {
            System.out.println("线程" + Thread.currentThread().getName() +
                    "正准备接受命令");
            cdOrder.await();
            System.out.println("线程" + Thread.currentThread().getName() +
                    "已接受命令");
            Thread.sleep((long)(Math.random()*10000));
            System.out.println("线程" + Thread.currentThread().getName() +
                    "回应命令处理结果");
            cdAnswer.countDown();
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      };
      service.execute(runnable);
    }
    try {
      Thread.sleep((long)(Math.random()*10000));

      System.out.println("线程" + Thread.currentThread().getName() +
              "即将发布命令");
      cdOrder.countDown();
      System.out.println("线程" + Thread.currentThread().getName() +
              "已发送命令，正在等待结果");
      cdAnswer.await();
      System.out.println("线程" + Thread.currentThread().getName() +
              "已收到所有响应结果");
    } catch (Exception e) {
      e.printStackTrace();
    }
    service.shutdown();

  }
}
