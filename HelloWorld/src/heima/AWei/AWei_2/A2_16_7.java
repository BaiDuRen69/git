package heima.AWei.AWei_2;

import java.util.Scanner;

public class A2_16_7 {
    public static void main(String[] args){
//              7的有缘数
//        需求：寻找7的有缘数，定义一个两位整数，只要该数字包含7或者是7的倍数，就是7的有缘数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数判断它是否为7的有缘数：");
        int input=sc.nextInt();
        boolean judge=false;
        while(input>0){
            int a=input%10;
            if(a==7){
                judge=true;
                break;
            }
            input/=10;
        }
        if(judge)System.out.println("是的呢");
        else System.out.println("不是吧");
    }
}
