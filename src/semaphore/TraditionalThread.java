package semaphore;

/**
 * Created by zhaihuilin on 2018/7/31 16:45.
 */
public class TraditionalThread {


  public static void main(String[] args) {

    Thread thread = new Thread(){
      @Override
      public void run() {
        while(true){
          try {
            Thread.sleep(500);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println("1:" + Thread.currentThread().getName());
          System.out.println("2:" + this.getName());
        }
      }
    };
    thread.start();


    Thread thread2 = new Thread(new Runnable(){
      @Override
      public void run() {
        while(true){
          try {
            Thread.sleep(500);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println("jlk:" + Thread.currentThread().getName());

        }

      }
    });
    thread2.start();


    new Thread(
            new Runnable(){
              public void run() {
                while(true){
                  try {
                    Thread.sleep(500);
                  } catch (InterruptedException e) {
                    e.printStackTrace();
                  }
                  System.out.println("runnable :" + Thread.currentThread().getName());

                }
              }
            }
    )
    {
      public void run() {
        while(true){
          try {
            Thread.sleep(500);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println("thread :" + Thread.currentThread().getName());

        }
      }
    }.start();


  }



}
