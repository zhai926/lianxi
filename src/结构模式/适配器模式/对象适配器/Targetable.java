package 结构模式.适配器模式.对象适配器;

/**
 * Created by zhaihuilin on 2018/8/17 10:41.
 */
public interface Targetable {

  /*与 Source 类中的方法一致*/
  public void method1();

  /*新增一个方法*/
  public void method2();


}
