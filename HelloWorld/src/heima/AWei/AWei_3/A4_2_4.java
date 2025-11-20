package heima.AWei.AWei_3;

import java.util.Scanner;

public class A4_2_4 {
    public static void main(String[] args){
       /* 需求：
        给定一个整数 n，请计算其所有数位之和。若 n 为负数，请先取其绝对值。
        示例1
        输入：12
        说明：1 + 2 = 3
        输出：3
        示例2
        输入：-305
        说明：获取绝对值305，再求和3 + 0 + 5 = 8
        输出：8
        */

        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int sum=0;
        if(input<0){
            input=-input;
        }
        while(input>0){
            int temp=input%10;
            sum+=temp;
            input/=10;
        }
        System.out.println(sum);
    }
}
