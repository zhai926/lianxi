package test;

import java.util.Scanner;

/**
 *  题目2:利用条件运算符的嵌套来完成此题：
 *  学习成绩>=90分的同学用A表示，
 *  60-89分之间的用B表示，
 *  60分以下的用C表示，
 *  如果离特殊线分数x差5分的用D表示。
 * Created by zhaihuilin on 2018/6/20 16:47.
 */
public class Test2 {

  public static void main(String[] args) {
         // 条件运算符的嵌套  ?:
         int score ;  // 成绩
         char grade ; // 等级
         int x ;  //离特殊线分数
         int cha;
          Scanner sc =new Scanner(System.in);

          System.out.println("请输入一个分数....");
          score=sc.nextInt();

          System.out.println("请输入分数:"+ score);

          System.out.println("请输入离特殊线分数...");
          x= sc.nextInt();

          System.out.println("请输入离特殊线分数:"+ x);

          cha=score-x;
          grade = (cha==5)? 'D':score>=90 ? 'A' : score<60 ? 'C':'B';

          System.out.println("分数等级是:"+ grade);


  }
}
