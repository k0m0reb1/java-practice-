//题目：求100之内的素数
import java.util.*;
public class Practice27{
  public static void main(String[] args) {
  //  boolean isSuShu = false
    for(int i=2;i<=100;i++){
      for(int j=2;j<=Math.sqrt(i);j++){
        if(i%j==0)
        break;
      }
      System.out.println(i +"是素数");
    }
  }
}
