//题目：判断101-200之间有多少个素数，并输出所有素数。
public class Practice2{
  public static void main(String[] args) {
    int i,j,calcu=0;        //calcu记录素数的个数
    for(i=101;i <= 200;i++){
      boolean jduge = true;     //设定一个控制方法
      for(j=2;j <= i-1;j++){
        int remainer = i%j;
        if (remainer == 0) {
          jduge = false;
          break;
        }
      }
      if(jduge){
      System.out.println(i + "--是素数");
      calcu += 1;
    }
    }
    System.out.println("素数的总数是" + calcu);
  }
}
