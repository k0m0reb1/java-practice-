//题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
import java.util.Scanner;
public class Practice6{
  public static void main(String[] args) {
    int maxDiv=0;
    int minMul=0;
    int temp =0;//设置一个中间变量用来临时存储数
    Scanner s = new Scanner(System.in);
    int m = s.nextInt();
    int n = s.nextInt(); //输入两个正整数
    int chengji = m*n;
    if(m > n)
    temp = n;
    else{
      temp = m;
      m = n;
    } //比较m和n的大小
    int remainer = 1; //设置一个变量存储余数
    while(remainer != 0){
      remainer = m%temp;
      m = temp;
      temp = remainer;//辗转相除
    }
    maxDiv = m;
    System.out.println("最大公约数= " + maxDiv);
    minMul = chengji/maxDiv;
    System.out.println("最小公倍数= " + minMul);
  }
}
