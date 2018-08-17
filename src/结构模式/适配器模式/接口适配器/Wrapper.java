package 结构模式.适配器模式.接口适配器;

/**
 *  创建一个 Wrapper 抽象类  实现 SourceInterface接口
 * Created by zhaihuilin on 2018/8/17 11:00.
 */
public  abstract class Wrapper implements  SourceInterface {
  /**
   *  我们都知道 抽象类 实现接口 可以全部 / 部分 或者 不实现 接口中的方法
   */

  @Override
  public void methed1() {

  }

  @Override
  public void methed2() {

  }
}
