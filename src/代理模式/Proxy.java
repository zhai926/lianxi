package 代理模式;

/**
 * Created by zhaihuilin on 2018/8/17 11:34.
 */
public class Proxy  implements SourceInterface{

  private  Source source;

  public Proxy() {
    super();
    this.source = new Source(); // 实例化一个对象
  }

  @Override
  public void method() {
    before();
    System.out.println("我是代理对象中的方法.....");
    after();
  }

  public  void   after(){
    System.out.println("after proxy");
  }

  public  void  before(){
    System.out.println("before proxy");
  }

}
