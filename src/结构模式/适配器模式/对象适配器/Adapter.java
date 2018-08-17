package 结构模式.适配器模式.对象适配器;

/**
 *  实现 Targetable 接口  而将 Source 注入进来
 *  而是持有Source类的实例，以达到解决兼容性的问题
 * Created by zhaihuilin on 2018/8/17 10:49.
 */
public class Adapter implements  Targetable {


  private  Source source;

  public Adapter(Source source) {
    super();
    this.source = source;
  }

  @Override
  public void method1() {
    source.method1();
  }

  @Override
  public void method2() {
    System.out.println("这是 【Targetable 接口】 中的方法......");
  }
}
