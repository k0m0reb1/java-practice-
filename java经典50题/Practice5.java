/*
题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，
60-89分之间的用B表示，60分以下的用C表示。
*/
import java.util.Scanner;
public class Practice5{
  public static void main(String[] args) {
    int score;
    char grade = '0';
    Scanner s = new Scanner(System.in);
    System.out.print("请输入成绩： ");
    score = s.nextInt();
    if(score <= 0 || score >= 100)
    System.out.println("您输入的成绩无效！");
    else if(score >= 90){
    grade = 'A';
    System.out.println("您输入的成绩等级是：" + grade);
    }
    else if(score < 60){
    grade = 'C';
    System.out.println("您输入的成绩等级是：" + grade);
    }
    else{
    grade = 'B';
    System.out.println("您输入的成绩等级是：" + grade);
    }
  }
}
