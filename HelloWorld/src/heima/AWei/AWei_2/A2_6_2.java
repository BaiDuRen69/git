package heima.AWei.AWei_2;

import java.util.Scanner;

public class A2_6_2 {
    public static void main(String[] args) {
//        键盘录入一个三位数，将其拆分为个位、十位、百位后，打印在控制台
        System.out.println("请输入一个三位数:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (;a>=1;) {
            int b=a%10;
            a/=10;
            System.out.println(b);
        }
    }
}
