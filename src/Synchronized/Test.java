package Synchronized;

/**
 * Created by zhaihuilin on 2018/7/17 15:53.
 */
public class Test implements  Runnable{

  private static   int count =0;

  public static void main(String[] args) {
     long  startTime = System.currentTimeMillis();
     System.out.println("开始执行的时候:" + startTime);
       for (int i= 0;i<10; i++){
         Thread  thread  =new Thread(new Test());
         thread.start();
       }

       try {
         Thread.sleep(1000);
       }catch (Exception e){
          e.printStackTrace();
       }
       System.out.println("执行的结果:" + count);
    long  entTime = System.currentTimeMillis();
    System.out.println("结束执行的时候:" + entTime);
    System.out.println("执行时间差:" + (entTime- startTime));
  }


  @Override
  public  void  run() {
      for (int i=0;i<10000;i++){
        count ++;
      }
  }
}
