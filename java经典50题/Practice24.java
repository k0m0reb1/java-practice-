//题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
import java.util.*;
public class Practice24{
  public static void main(String[] args) {
    System.out.print("请输入一个不多于5位的正整数：");
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int[] num = new int[5];
    int i;
    for(i=0;a != 0 && i<5;i++){
      num[i]=a%10;
      a = a/10;
    }
    System.out.println(i);
    for(int j=0;j<=i-1;j++){
      System.out.print(num[j]+"");
    }
  }
}
