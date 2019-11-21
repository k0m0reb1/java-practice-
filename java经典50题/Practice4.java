//题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5
public class Practice4{
  public static void main(String[] args) {
    int n = 2310;
    decompose(n);
  }
  public static void decompose(int n){
    System.out.print(n+"=");
    for(int j=2;j<=n;j++){
      while(n%j == 0 && j != n) {
      System.out.print(j + "*");
      n = n/j;
    }
    if(j == n)
      System.out.print(n);
    }
    }
  }
