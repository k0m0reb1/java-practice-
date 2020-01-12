//题目：写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度
import java.util.Scanner;
public class Practice38{
  public static void main(String[] args) {
    System.out.println("请输入一个字符串:");
    Scanner s=new Scanner(System.in);
    String str = s.next();
    int strLength = str.length();
    System.out.printf("您输入的字符串长度是%d",strLength);
  }
}
