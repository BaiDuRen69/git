package heima.AWei.AWei_2;

import java.util.Scanner;

public class A2_16_6 {
    public static void main(String[] args){
//             回文数
//        需求：键盘录入四位整数，判断这个数字是否为回文数。
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数：");
        int input=sc.nextInt();
        int temp1=input,temp2=input;
        int len=0;
        while(temp1>0){
            temp1/=10;
            len++;
        }
        int a=0;
        while(input>0){
            a*=10;
            a+=input%10;
            input /= 10;
        }
        if(temp2==a){
            System.out.println("这是一个回文数");
        }else{
            System.out.println("这不是一个回文数");
        }
    }
}
