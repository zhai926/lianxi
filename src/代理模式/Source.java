package 代理模式;

/**
 * Created by zhaihuilin on 2018/8/17 11:35.
 */
public class Source implements  SourceInterface {

  @Override
  public void method() {
    System.out.println("这是 Source 的 方法....");
  }
}
