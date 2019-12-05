//输出九九乘法口诀
public class Practice16{
  public static void main(String[] args) {
    for(int i=1;i<=9;i++){
      for(int j=1;j<=i;j++){
        System.out.print(j+"*"+i+"="+j*i+"\t");
      }
      System.out.println();
    }
  }
}
