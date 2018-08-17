package test;

/**
 * 打印出能被3整除的所有"水仙花数"，
 * 所谓"水仙花数"是指一个三位数，
 * 其各位数字立方和等于该数本身。
 * 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
 * Created by zhaihuilin on 2018/6/20 17:50.
 */
public class Test3  {

  public static void main(String[] args) {

      // 所谓"水仙花数"是指一个三位数， =====>   <1000
      for (int i =0 ; i<1000; i++){
           int  b =  i/100 ;//  百位
           int  s =  (i%100)/10;  // 十位
           int  g =i%10 ; // 个位


           if (b*b*b + s*s*s + g*g*g ==i){
             System.out.println("满足条件的数字:" + i);
           }

      }
  }
}
