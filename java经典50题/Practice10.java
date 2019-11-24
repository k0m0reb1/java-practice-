/*
题目：一球从h米高度自由落下，每次落地后反跳回原高度的一半；
再落下，求它在 第n次落地时，共经过多少米？第n次反弹多高？
*/
import java.util.*;
public class Practice10{
  public static void main(String[] args) {
    System.out.print("请输入小球下落的高度：");
    Scanner s = new Scanner(System.in);
    double h = s.nextDouble();
    System.out.print("请输入小球反弹的次数: ");
    int n = s.nextInt();
    double distance = 0.0;
    double height = h;
    for(int i=1;i <= n;i++){
      height = height*0.5;
      distance =distance + (i>1 ? height*2*2 : h);
    }
    System.out.println("小球经过了 " + distance +"米");
    System.out.println("反弹的高度是 " + height + "米");
  }
}
