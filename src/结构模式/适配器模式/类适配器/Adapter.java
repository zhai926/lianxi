package 结构模式.适配器模式.类适配器;

/**
 *  继承Source 类  并实现 Targetable  重写  method2()
 * Created by zhaihuilin on 2018/8/17 10:43.
 */
public class Adapter  extends  Source implements  Targetable {

  @Override
  public void method2() {
    System.out.println("这是 【Targetable 接口】 中的方法......");
  }


  //@Override
  //public void method1() {
  //  System.out.println("这是 【Adapter 接口】 中的方法......");
  //}
}
