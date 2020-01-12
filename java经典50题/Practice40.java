//题目：字符串排序。
import java.util.Arrays;
public class Practice40{
  public static void main(String[] args) {
    String[] str = {"abc","kdfdf9","ighd","eric","ieer"};
    String temp = null;
    for(int i=0;i<str.length-1;i++){
      for(int j=i+1;j<str.length;j++){
        if(str[j].compareTo(str[i])<0){
          temp = str[i];
          str[i] = str[j];
          str[j] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(str));
  }
}
