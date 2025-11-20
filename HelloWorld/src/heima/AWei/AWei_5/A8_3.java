package heima.AWei.AWei_5;

import java.util.Scanner;

public class A8_3 {
    public static void main(String[] args) {
//          计算快递邮费
//        需求：
//        某快递公司的运费规则如下（首重1kg，超出部分按另算，不足1kg按1kg算）：
//            首重1kg：10元；
//            超出1-5kg：每kg加2元；
//            超出5kg以上：每kg加1.5元。
//            键盘录入小数，表示用户快递的重量，计算最终的结果
//        要求1：快递重量必须大于0，否则重新输入
//        要求2：不同价位的计算，单独定义一个方法
//        代码说明：
//        - 代码示例1：是最基本最简单的代码实现，但是代码中计算超重部分重复代码了，现在重复代码业务较为简单可以忽略，但是如果重复代码比较多，再这么写就不合适了，可以参考代码示例2。
//        - 代码示例2：解决了代码重复问题，并且对代码进行了优化。
        Scanner sc = new Scanner(System.in);
        double input;
        do{
            System.out.println("请输入重量：");
            input=sc.nextDouble();
        }while(input<0);
        System.out.println("运费为："+get1(input));
    }
    public static double get1(double input){
        if(input<=1) return 10;
        else if(input<=5) input=10+(Math.ceil(input-1))*2;
        else input=10+2*4+(Math.ceil(input-5))*1.5;
        return input;
    }
}
