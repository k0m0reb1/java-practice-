//题目：利用递归方法求5!。
public class Practice22{
  public static void main(String[] args) {
    int result =jieCheng(5);
    System.out.println(result);
  }
  public static int jieCheng(int n){
    if(n==1){
      return 1;
    }else
    return n*jieCheng(n-1);
  }
}
