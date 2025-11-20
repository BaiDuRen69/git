package heima.AWei.AWei_2;

import java.util.Scanner;

public class A2_15_2 {
    public static void main(String[] args) {
//        比较身高
//        键盘录入你和你好基友的身高，比一比谁更高？
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入你的身高：");
    double high1=sc.nextDouble();
    System.out.println("请输入你朋友的身高：");
    double high2=sc.nextDouble();
    boolean judge=high1>=high2;
    if(judge){
        if(high1==high2){
            System.out.println("一样高");
        }else{
        System.out.println("你更高");}
    }else{
        System.out.println("你朋友很高");
    }
    }
}
