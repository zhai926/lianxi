package test;

import java.util.Scanner;

/**
 *  输入一行字符，分别统计出英文字母、空格、数字、和其它字符的个数
 * Created by zhaihuilin on 2018/6/20 16:34.
 */
public class Test1 {

  public static void main(String[] args) {
        int charSum = 0; // 记录字符数目
        int blankSum = 0;// 记录空格数目
        int numberSum = 0;// 记录数字数目
        int otherSum = 0;// 记录其他字符的数目
    Scanner sc =new Scanner(System.in);
    System.out.println("请输入一行字符串.....");
    String STR= sc.nextLine();
    System.out.println("输入的字符串是:"+STR);
    //  将字符串转换成 char 类型
     char[]  chars=STR.toCharArray();
     // 遍历
    for (int i= 0; i<chars.length;i++){
           if (Character.isLetter(chars[i])){  //是否是一个字母
               charSum ++;
           }else if (Character.isDigit(chars[i])){ // 是否是数字
               numberSum++;
           }else if (Character.isWhitespace(chars[i])){  // 是否是 空格
               blankSum ++ ;
           }else {
             otherSum ++;
           }
    }
    System.out.println("输入的字符串中有字母的个数是:" + charSum);
    System.out.println("输入的字符串中有数字的个数是:" + numberSum);
    System.out.println("输入的字符串中有空格的个数是:" + blankSum);
    System.out.println("输入的字符串中其它字符的个数是:" + otherSum);
  }
}
