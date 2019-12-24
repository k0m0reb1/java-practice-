//题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母。
import java.util.*;
public class Practice26{
  public static void main(String[] args) {
    System.out.println("请输入第一个字母：");
    Scanner s = new Scanner(System.in);
    String input1 = s.next();
    switch(input1){
      case "m":
      System.out.println("星期一");
      break;
      case "t":
      System.out.println("请输入第二个字母：");
      String input2 = s.next();
      if(input2.equals("u"))
      System.out.println("星期二");
      else if(input2.equals("h")){
      System.out.println("星期四");
    }
      break;
      case "w":
      System.out.println("星期三");
      break;
      case "f":
      System.out.println("星期五");
      break;
      case "s":
      System.out.println("请输入第二个字母：");
      String input3 = s.next();
      if(input3.equals("u"))
      System.out.println("星期日");
      else if(input3.equals("a")){
      System.out.println("星期六");
    }
      break;
      default:
      System.out.println("您输入的字母不对！");
    }
  }
}
