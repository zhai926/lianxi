import java.util.*;

/**
 * Created by zhaihuilin on 2018/8/7 11:55.
 */
public class Test2 {

      private Test2(){}

      private static  class LazyHaolder{
         static  final Test2 INSTANCE= new Test2();

         static {
           System.out.println("LazyHaolder.<clinit>");
         }

      }

      public static  Object getInstance(boolean flag) {
        if (flag) return new LazyHaolder[2];
        return LazyHaolder.INSTANCE;
      }

  public synchronized static void main(String[] args) {
    Map<String,String>  map =new HashMap<String, String>();

    Map<String,String>  map1= new Hashtable<String, String>();


    List<Object> list =new  ArrayList<Object>();

    List<Object> list1 =new  LinkedList<Object>();



    map.put("name","张三");
    map.put("sex","男");
    map.put("adress","上海");
    System.out.println("原来的map{},"+map);

    String name=map.get("name");
    System.out.println("获取的name 的值："+ name);

    boolean flag=map.containsKey("age");
    System.out.println("是否包含此键："  + flag);

    Set<Map.Entry<String, String>> entrySet=map.entrySet();

    map.remove("sex");

    System.out.println("此时的map{}:"+ map);

    boolean kk= map.equals(map);
    System.out.println("----------------->:" + kk);

    map.clear();

    System.out.println("此时的map{},"+ map);
  }
}
