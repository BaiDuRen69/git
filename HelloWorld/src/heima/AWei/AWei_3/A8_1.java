package heima.AWei.AWei_3;

import java.util.Scanner;

public class A8_1 {
    public static void main(String[] args){
//             猜数字小游戏1
//        需求：程序自动生成一个1-100之间的随机数，在代码中使用键盘录入去猜出这个数字是多少？
//        要求：使用循环猜，一直猜中为止。
//        思路分析：
//        1. 生成一个1-100之间的随机数
//        2. 使用键盘录入去猜出这个数字是多少
//        3. 把反复猜的代码写在循环中
        int number=(int)(Math.random()*100+1);
        Scanner sc= new Scanner(System.in);
        int sum=0;
        while(true){
            int input=sc.nextInt();
            if(input<number){
                System.out.println("猜小了");
            }else if(input==number){
                System.out.println("猜对了");
                break;
            }else{
                System.out.println("猜大了");
            }
            sum++;
        }
        System.out.println("你猜了"+sum+"次");
    }
}
