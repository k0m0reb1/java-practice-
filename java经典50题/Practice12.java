/*
题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；
利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，
可可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之
间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可提
成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求
应发放奖金总数？
*/
import java.util.*;
public class Practice12{
  public static void main(String[] args) {
    double bonus;
    System.out.print("请输入利润：");
    Scanner s = new Scanner(System.in);
    double profit = s.nextDouble();
    if(profit <= 10.0)
    bonus = profit*0.1;
    else if(profit <=20)
    bonus =10*0.1 + (profit-10)*0.075;
    else if(profit <= 40)
    bonus =10*0.1 + 10*0.075 + (profit-20)*0.05;
    else if(profit <= 60)
    bonus = 10*0.1 + 10*0.075 + 20*0.05 + (profit-40)*0.03;
    else if(profit<=100)
    bonus =10*0.1 + 10*0.075 +20*0.05 +20*0.03 + (profit-60)*0.015;
    else
    bonus =10*0.1+10*0.075+20*0.05+20*0.03+40*0.015+(profit-100)*0.01;
    System.out.println("奖金是： "+ bonus +"万");
  }
}
