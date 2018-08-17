package 代理模式;

/**
 * Created by zhaihuilin on 2018/8/17 11:41.
 */
public class Test  {

  public static void main(String[] args) {

      SourceInterface  sourceInterface =new Proxy();
      sourceInterface.method();
  }
}
