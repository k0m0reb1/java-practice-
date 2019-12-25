//题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
import java.util.*;
public class Practice30{
  public static void main(String[] args) {
    int[] a ={1,12,25,38,49};
    System.out.println("请输入一个数：");
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int[] b = new int[a.length + 1];
    if(num<a[0]){
      b[0]=num;
      for(int i=1;i<=b.length-1;i++){
        b[i]=a[i-1];
      }
    // }else if(num>=a[a.length-1]){
    //   b[b.length-1]=num;
    //   for(int y=0;y<=a.length-1;y++){
    //     b[y]=a[y];
    //   }
    // }
    else{
      for(int j=0;j<=a.length-1;j++){
        if(num>=a[j]){
          for(int k=0;k<=j;k++){
            b[k]=a[k];
          }
          b[j+1]=num;
          for(int l=j+2;l<=b.length-1;l++){
            b[l] = a[l-1];
          }
        }
        else continue;
      }
    }
    System.out.println(Arrays.toString(b));
  }
}
