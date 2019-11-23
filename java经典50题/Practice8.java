/*
题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
输出结果的形式如：2+22+222=246；
*/
import java.util.*;
public class Practice8{
  public static void main(String[] args) {
    System.out.print("请输入a,a从1到9---->");
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    System.out.print("请入有几个数相加---->");
    int u = s.nextInt();
      int sum = 0;
      int num = 0;
      int i = 1;
        for(i=1;i <= u; i++){ //读取a aa aaa .......
          int power = 1;
          for(int j=1; j < i;j++){
            power *= 10;
      }
        num = num + a*power;
        System.out.print(num);
        if(i != u)
        System.out.print("+");
        sum = sum + num;
    }
    System.out.println(" = " + sum);
  }
}
