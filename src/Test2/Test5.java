package Test2;

/**
 * Created by zhaihuilin on 2018/7/12 10:43.
 */
public class Test5 {

  public static void main(String[] args) {
      String   s  = "hello";

      String   s1 = "he"  + new String("llo");

      System.out.println( s==s1);

      String   s2 = "he"  + "llo";

      System.out.println( s==s2);

      String s3 =new String("he")+ new String("llo");

      System.out.println( s==s3);

      System.out.println( s3==s2);

      System.out.println( s.equals(s2));

  }
}
