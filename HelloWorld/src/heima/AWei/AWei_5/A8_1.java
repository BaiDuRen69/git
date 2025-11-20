package heima.AWei.AWei_5;

import java.util.Scanner;

public class A8_1 {
    public static void main(String[] args){
//        评委打分
//     需求：
//        跳水比赛有五个评委打分，分数在0~100之间。最终得分会去掉一个最高分，去掉一个最低分，剩余的分数再求平均数，改平均数为选手最终得分。
//     要求1：利用键盘录入5个整数存入数组当中，如果分数超出范围需要重新录入
//     要求2：定义方法分别求数组的最大值和最小值
//     要求3：计算五名评委的总分
//     要求4：总分 – 最大值 – 最小值，求选手最终平均分

        int[] arr=new int[5];
        boolean flag=false;
        //调用方法1
        input1(arr);
        //调用方法2
        /*while(!flag){
            flag=input2(arr);
        }*/
        System.out.println(getAverage(arr));
        //以下为格式化输出
        System.out.printf("%.2f%n", getAverage(arr));
    }
    //方法1
    //一个输错再输入一个对的就行了
    public static int[] input1(int[] arr){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            int temp=sc.nextInt();
            arr[i]=temp;
            if(temp<0||temp>100){
                System.out.println("输入数据有误，请重新录入");
                i--;
            }
        }
        return arr;
    }
    //方法2
    //输错一个，全部重新输
    public static boolean input2(int[] arr){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int temp=sc.nextInt();
            if(temp<0||temp>100){
                System.out.println("输入数据有误，请全部重新录入");
                return false;
            }
            arr[i]=temp;
        }
        return true;
    }
    public static double getAverage(int[] arr){
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) max=arr[i];
            if(min>arr[i]) min=arr[i];
        }
        double average=0;
        for (int i = 0; i < arr.length; i++) average+=arr[i];
        average=average-max-min;
        return average/3;
    }
}
