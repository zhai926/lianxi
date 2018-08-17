package 结构模式.适配器模式.对象适配器;



/**
 * Created by zhaihuilin on 2018/8/17 10:46.
 */
public class Test {

  public static void main(String[] args) {

      Source  source  = new Source();
      Adapter adapter = new Adapter(source);

      adapter.method1();

      adapter.method2();
  }
}
