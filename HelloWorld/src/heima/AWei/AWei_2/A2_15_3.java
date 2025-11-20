package heima.AWei.AWei_2;

import java.util.Scanner;

public class A2_15_3 {
    public static void main(String[] args){
//              是否能被3整除
//        需求：键盘录入一个3位数，判断是否能被3整除
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int input=sc.nextInt();
        if(input%3==0)
            System.out.println("能");
        else
            System.out.println("不能");
    }
}
