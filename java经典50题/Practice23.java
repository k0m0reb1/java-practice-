/*
题目：有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，他说比第3个
人大2岁。问第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。最后问第一个人，
他说是10岁。请问第五个人多大？
*/
public class Practice23{
  public static void main(String[] args) {
    int result = calAge(5);
    System.out.println("第5个人的年龄是："+result);

  }
  public static int calAge(int PeopleNumber){
    if(PeopleNumber == 1){
      return 10;
    }else{
      return calAge(PeopleNumber-1)+2;
    }
  }
}
