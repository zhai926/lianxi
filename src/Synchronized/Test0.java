package Synchronized;

/**
 * Created by zhaihuilin on 2018/7/17 15:58.
 */
public class Test0 implements  Runnable {

  private static  int count =0;


  public static void main(String[] args) {

     long  startTime = System.currentTimeMillis();
     System.out.println("开始执行的时候:" + startTime);


       synchronized (Test0.class){
         for (int i=0;i<10;i++){
           Thread thread =new Thread(new Test0());
           thread.start();
         }
       }

      try {
        Thread.sleep(1000);
      }catch ( Exception e){
         e.printStackTrace();
      }

    System.out.println("执行的结果：" + count);
    long  entTime = System.currentTimeMillis();
    System.out.println("结束执行的时候:" + entTime);
    System.out.println("执行时间差的时候:" + (entTime- startTime));
  }

  @Override
  public   void   run() {

    /**
     *  这种写法没办法保证 count =100000  并且省时  性能不够好
     */
    //for (int i= 0; i<10000;i++){
    //   synchronized (this){
    //      count ++ ;
    //   }
    //}



     synchronized (Test0.class){
       for (int i = 0; i<10000; i++){
         count ++;
       }
     }


  }


  public static synchronized  void  method(){

  }






}
