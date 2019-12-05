//题目：输入某年某月某日，判断这一天是这一年的第几天？
public class Practice14{
  public static void main(String[] args) {
    System.out.print("请输入今年是哪一年：");
    java.util.Scanner s = new java.util.Scanner(System.in);
    int year = s.nextInt();
    System.out.println();
    System.out.print("请输入现在是哪一个月：");
    int month = s.nextInt();
    System.out.println();
    System.out.print("请输入现在是几号：");
    int day = s.nextInt();
    int[] daysToMonth = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
    if((year%4 == 0 && year%100 != 0)||year%400 == 0)//判断闰年
    daysToMonth = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
    int whichDay = day;
    for(int i=0;i<month-1;i++){
      whichDay += daysToMonth[i];
    }
    System.out.println("现在是"+year+"的第"+whichDay+"天");
  }
}
