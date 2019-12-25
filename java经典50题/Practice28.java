//题目：对10个数进行排序
import java.util.*;
public class Practice28{
  public static void main(String[] args) {
    System.out.println("请依次输入十个整数，以空格结束每一次输入");
    Scanner s = new Scanner(System.in);
    int[] arr = new int[10];
    for(int i=0;i<=9;i++){
      arr[i] = s.nextInt();
    }
  //  int[] arr ={100,256,21,32,698,784,521,12,-98,-9};
    System.out.println(Arrays.toString(sort1(arr)));
  }
  //冒泡排序
  private static int[] sort1(int[] arr){
    for(int i=arr.length-1;i>=0;i--){
      for(int j=0;j <= i-1;j++){
        int temp=0;
        if(arr[j]>arr[j+1]){
          temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    return arr;
  }
}
