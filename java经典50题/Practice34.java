//题目：输入3个数a,b,c，按大小顺序输出。
import java.util.Scanner;
public class Practice34{
  public static void main(String[] args) {
    System.out.println("请依次输入三个数：");
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    int[] arr = {a,b,c};
    //  选择排序
    for(int i=0;i<arr.length-1;i++){
      int temp = arr[i];
      for(int j=i+1;j<arr.length;j++){
        if(arr[j]>arr[i]){
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.printf("%d>%d>%d",arr[0],arr[1],arr[2]);
  }
}
