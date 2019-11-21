/*
 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：
 153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方
*/
public class Practice3{
  public static void main(String[] args) {
    for(int i = 100;i < 1000;i++){
      int a,b,c; //提取i的三个数字
      a = (i-(i%100))/100;
      c = i%10;
      b = (i-100*a-c)/10;
      if((a*a*a + b*b*b + c*c*c) == i)
      System.out.println(i + " is Lotus number");
    }
  }
}
