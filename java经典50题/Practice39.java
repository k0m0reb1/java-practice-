//题目：编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，
//调用函数1/1+1/3+...+1/n(利用指针函数)
import java.util.*;
public class Practice39{
  public static void main(String[] args) {
    System.out.print("请输入一个整数：");
    Scanner s = new Scanner(System.in);
    int a=s.nextInt();
    double sum = 0;
    if(a%2==0){
      for(int i=2;i<=a;i=i+2){
        sum+=1/(double)i;
      }
    }
    else{
        for(int i=1;i<=a;i=i+2){
          sum+=1/(double)i;
        }
      }
      System.out.println(sum);
    }
  }
