/*
题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？
都是多少？
*/
public class Practice11{
  public static void main(String[] args) {
    int count =0;
    int sum =0;
    for(int i = 1;i <= 4;i++){
      for(int j = 1;j <= 4;j++){
        if(j==i)
        continue;
      for(int k = 1;k <= 4;k++){
        if(k != i && k != j){
        System.out.println(sum = 100*i + 10*j + k);
        count++;
          }
        else
        continue;
        }
      }
    }
    System.out.println("组成的数字总数是:" + count);
  }
}
