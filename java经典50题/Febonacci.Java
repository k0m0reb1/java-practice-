/*
题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一
对兔子，假如兔子都不死，问每个月的兔子总数为多少？
*/
public class Febonacci{
  public static void main(String[] args) {
    int i = 10;
    System.out.println(prog(i));
  }
  public static int prog(int i){
    if(i == 1 || i == 2){
      return 1;
    }
    else{
      return prog(i-1)+prog(i-2);
    }
  }
}
