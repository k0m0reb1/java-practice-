//题目：取一个整数a从右端开始的4～7位。
import java.util.Arrays;
public class Practice32{
  public static void main(String[] args){
    System.out.print("请输入一个大于7位的整数：");
    java.util.Scanner s = new java.util.Scanner(System.in);
    Long a = s.nextLong();
    if(a<1000000){
      System.out.println("输入错误！");
    }
    String a1 = a + "";
    char[] arr = a1.toCharArray();
    char[] arr1 = new char[4];
    for(int i=0;i<4;i++){
      arr1[i] = arr[arr.length-4-i];
    }
    System.out.println(Arrays.toString(arr1));
  }
}
