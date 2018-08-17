package Test2;

/**
 * Created by zhaihuilin on 2018/7/12 10:31.
 */
public class Test {

  public Test() {
    System.out.println("我是父类A");
  }

  {
    System.out.println("我是父类的静态块");
  }

  static {
    System.out.println("我是static父类B");
  }

  public  void  say(){
    System.out.println("我是父类唱歌");
  }
}
