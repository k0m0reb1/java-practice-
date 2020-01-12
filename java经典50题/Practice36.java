//题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
import java.util.Arrays;
public class Practice36{
  public static void main(String[] args) {
    int n = 10;
    int[] arr =new int[n];
    for(int i=0;i<n;i++){
      arr[i]=(int)(Math.random()*10);
    }
    System.out.println(Arrays.toString(arr));
    int m=4;
    int[] newArr = new int[n];
    for(int j=0;j<m;j++){
      newArr[j] = arr[n-m+j];
    }
    for(int k =m;k<n;k++){
      newArr[k]=arr[k-m];
    }
      System.out.println(Arrays.toString(newArr));
  }
}
