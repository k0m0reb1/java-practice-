//题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
import java.util.Arrays;
public class Practice35{
  public static void main(String[] args) {
    int[] arr = {4,6,9,1,3,2,5,7,8};
    change(arr);
    System.out.println(Arrays.toString(arr));
  }
  public static int[] change(int[] arr){
    int temp=0;
    //for循环找出最大值的位置；然后把最大值和第一个值进行交换
    int temp1=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>arr[temp1]){
        temp1 = i;
      }
    }
    temp = arr[0];
    arr[0]=arr[temp1];
    arr[temp1] = temp;
    //同理，找出最小值的位置与最后一个交换；
    int temp2 = arr.length-1;
    for(int j=0;j<arr.length-1;j++){
      if(arr[j]<arr[temp2]){
        temp2 = j;
      }
    }
    temp = arr[arr.length-1];
    arr[arr.length-1]=arr[temp2];
    arr[temp2] = temp;
    return arr;
  }
}
