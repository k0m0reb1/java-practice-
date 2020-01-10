/*
题目：打印出杨辉三角形（要求打印出10行如下图）

程序分析：

        1

      1 1

     1 2 1

   1 3 3 1

  1 4 6 4 1

1 5 10 10 5 1
*/
public class Practice33{
  public static void main(String[] args) {
    int[][] arr =new int[10][];
    for(int i=0;i<10;i++){
      arr[i] = new int[i+1];
    }
    for(int i=0;i<10;i++){
      arr[i][0]=1;
      arr[i][i]=1;
      for(int j=1;j<=i-1;j++){
        arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
      }
    }
    //打印数组，用空格排版；
    for(int i=0;i<10;i++){
      for(int j=1;j<=9-i;j++){
        System.out.print(" ");
      }
      for(int k=0;k<arr[i].length;k++){
        System.out.print(arr[i][k]+" ");
      }
      System.out.println();
    }
  }
}
