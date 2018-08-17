package 结构模式.适配器模式.接口适配器;

/**
 * Created by zhaihuilin on 2018/8/17 11:02.
 */
public class SourceSub1  extends  Wrapper {

  @Override
  public void methed1() {
    System.out.println("这是 【SourceSub1 类】  中的 methed1()方法 ......");
  }

  @Override
  public void methed2() {
    System.out.println("这是 【SourceSub1 类】  中的 methed2()方法 ......");
  }
}
