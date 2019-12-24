//题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
import java.util.*;
public class Practice25{
  public static void main(String[] args) {
    System.out.print("请输入一个五位数：");
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    if(num <=99999&&num >=10000){
    System.out.println(num + (isHWS(num)?"是":"不是") + "回文数！");
  }
  else{
    System.out.println("您输入的不是五位数！");
  }
  }
  private static boolean isHWS(int num){
    int reserveNum = num;
    int[] arr = new int[5];
    for(int i=0;i<5;i++){
      arr[i] = num%10;
      num = num/10;
    }
    int newNum = arr[0]*10000+arr[1]*1000+arr[2]*100+arr[3]*10+arr[4];
    // System.out.println("==========================");
    // System.out.println(reserveNum);
    // System.out.println(newNum);
    if(newNum == reserveNum){
      return true;
    }else
    {
      return false;
    }
  }
}
