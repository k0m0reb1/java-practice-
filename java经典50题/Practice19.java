/*
题目：打印出如下图案（菱形）

    *

   ***

  *****

 *******

  *****

   ***

    *
*/
public class Practice19{
  public static void main(String[] args) {
    int n =4;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");//输出空格
      }
      for(int k=1;k<=i*2-1;k++){
        System.out.print("*");
      }
      System.out.print("\n");
    }//上半部分输出完毕；下面输出下半部分
    for(int i=1;i<=n-1;i++){
      for(int j=1;j<=i;j++){
        System.out.print(" ");
      }
      for(int k=1;k<=2*(n-i)-1;k++){
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
