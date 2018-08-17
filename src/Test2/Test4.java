package Test2;

/**
 * Created by zhaihuilin on 2018/7/12 10:38.
 */
public class Test4 {

  public static void main(String[] args) {
    Test test =new Test();
    test = new Test1();

    //我是static父类B
    //        我是父类A
    //我是static子类D
    //        我是父类A
    //我是子类C

    //Test test =new Test1();
    //test = new Test();

    //我是static父类B
    //        我是static子类D
    //我是父类A
    //        我是子类C
    //我是父类A
  }
}
