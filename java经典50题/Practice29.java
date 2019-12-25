//题目：求一个3*3矩阵对角线元素之和
public class Practice29{
  public static void main(String[] args) {
    System.out.println("请输入一个3*3矩阵：");
    java.util.Scanner s = new java.util.Scanner(System.in);
    int[][] arr = new int[3][3];
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        arr[i][j] = s.nextInt();
      }
    }
    int sum1 =arr[0][0]+arr[1][1]+arr[2][2];
    int sum2 = arr[0][2]+arr[1][1]+arr[2][0];
    System.out.println("主对角线的和为："+sum1);
    System.out.println("副对角线的和为："+sum2);
  }
}
