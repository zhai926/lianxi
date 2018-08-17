package Test2;

/**
 * Created by zhaihuilin on 2018/7/12 10:32.
 */
public class Test1 extends  Test {


  public Test1() {
    System.out.println("我是子类C");
  }



  static {
    System.out.println("我是static子类D");
  }

  {
    System.out.println("我是子类类的静态块");
  }


  @Override
  public void say() {
    System.out.println("我是子类跳舞");
  }
}
