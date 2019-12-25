//题目：求100之内的素数
import java.util.*;
public class Practice27{
  public static void main(String[] args) {
    for(int i=2;i<=100;i++){
        boolean isSuShu = true;
      for(int j=2;j<=Math.sqrt(i);j++){
        if(i%j==0){
          isSuShu = false;
          break;
        }
      }
      if(isSuShu){
      System.out.println(i + "是素数");
    }
    }
  }
}
