//题目：输入三个整数x,y,z，请把这三个数由小到大输出。
public class Practice15{
  public static  void main(String[] args){
    System.out.println("请依次输入三个整数：");
    java.util.Scanner s = new java.util.Scanner(System.in);
    int x = s.nextInt();
    int y = s.nextInt();
    int z = s.nextInt();
    int temp1 = 0;
    if(x>y){
      temp1 = x;
      x = y;
      y = temp1;
    }
    if(y>z){
      temp1 = y;
      y = z;
      z = temp1;
    }
    if(x>y){
      temp1 = x;
      x = y;
      y = temp1;
    }
    System.out.println(x + "<" + y + "<" + z);
  }
}
