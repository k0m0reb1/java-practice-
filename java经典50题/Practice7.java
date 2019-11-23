//题目：输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数。
import java.util.*;
public class Practice7{
  public static void main(String[] args) {
    System.out.print("请输入一个字符串： ");
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();
    int englishLetter = 0;
    int space = 0;
    int number = 0;
    int others = 0;
    char[] arr = str.toCharArray(); //遍历字符串的所有字符
    for(int i = 0;i < arr.length;i++)
    {
      if((arr[i] >= 'a' && arr[i] <= 'z')||(arr[i] >= 'A' && arr[i] <= 'Z'))
      englishLetter +=1;
      else if(arr[i] >= '0' && arr[i] <= '9')
      number +=1;
      else if(arr[i] == ' ')
      space ++;
      else
        others +=1;
    }
    System.out.println("字母的个数是：" + englishLetter + "个");
    System.out.println("数字的个数是：" + number + "个");
    System.out.println("空格的个数是：" + space + "个");
    System.out.println("其它字符的个数是：" + others + "个");
  }
}
