//题目：将一个数组逆序输出。
public class Practice31{
  public static void main(String[] args) {
    int[] arr = new int[10];
    for(int i=1;i<10;i++){
      arr[i]=i;
    }
    //方法1：逆序打印数组
    for(int i=arr.length-1;i>=0;i--){
      System.out.println(arr[i]);
    }
    //方法2：将数组第一个与最后一个交换，依此类推
    for(int i=0;i<arr.length/2;i++){
      int temp = 0;
      temp=arr[i];
      arr[i]=arr[arr.length-1-i];
      arr[arr.length-1-i]=temp;
    }
    for(int a:arr){
      System.out.println(a);
    }
  }
}
