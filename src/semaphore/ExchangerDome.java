package semaphore;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Exchanger 适用于两个线程之间的交互   【 绑架案=】
 * Created by zhaihuilin on 2018/7/31 15:34.
 */
public class ExchangerDome {

  public static void main(String[] args) {

    // 定义一个交换器
    final Exchanger<String> exchanger = new Exchanger();

    //两个用户

    ExecutorService executorService = Executors.newCachedThreadPool();

    //  1. 张三团伙
    executorService.execute(new Runnable() {
      @Override
      public void run() {
        try {
          // 张三团伙 将 大乔 交换 出去
          // 张三开始喊话
          System.out.println("1000万带来了没");



          String content = exchanger.exchange("大乔");
          System.out.println("张三团伙将大乔送出去，去交换" + content);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }

    });


    // 大桥家属
    executorService.execute(new Runnable() {
      @Override
      public void run() {
        try {
          // 张三团伙 将 大乔 交换 出去
          System.out.println("带来了，人带来吗？");

          String content = exchanger.exchange("1000万");
          System.out.println(" 大桥家属将1000万送出去，去交换" + content);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });

    executorService.shutdown();





  }

  }
