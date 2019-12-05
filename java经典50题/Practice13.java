/*
题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
在10万以内判断
*/
public class Practice13{
  public static void main(String[] args) {
    for(int i=1;i<=100000;i++){
      for(int j=1;j*j<=i+100;j++){
        if(j*j == i+100){
          for(int k=1;k*k <=i+268;k++){
            if(k*k == i+268){
              System.out.println(i+" 满足条件");
            }
          }
        }
      }

    }
  }
}
