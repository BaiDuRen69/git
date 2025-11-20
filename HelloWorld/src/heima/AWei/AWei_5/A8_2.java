package heima.AWei.AWei_5;

import java.util.Scanner;

public class A8_2 {
    public static void main(String[] args){
//        计算班级分数
//     需求：
//        班主任需要统计10名学生的数学成绩（0-100分），
//        计算及格率，平均分，并找出最高分。
//        要求1：键盘录入10名学生的成绩，存入数组。超出范围，提示“成绩无效，请重新输入”。
//        要求2：定义方法，求及格人数，根据及格人数，求及格率。
//        要求3：定义方法求总分，根据总分求平均分
//        要求4：定义方法求最大值。
        int[] arr=new int[10];
        input(arr);
        int num=passingNumber(arr);
        System.out.printf("及格人数为："+num+"%n"+"及格率是："+num/10.0+"%n");
        int sum=getSum(arr);
        System.out.printf("总分为："+sum+"%n"+"平均分是："+sum/10.0+"%n");
        int max=getMax(arr);
        System.out.println("最高分是："+max);
    }
    //录入
    public static void input(int[] arr){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            int temp=sc.nextInt();
            arr[i]=temp;
            //判断数据是否有效
            if(temp<0||temp>100){
                System.out.println("输入数据有误，请重新录入");
                i--;
            }
        }
    }
    //计算及格人数
    public static int passingNumber(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=60) count++;
        }
        return count;
    }
    //求总分
    public static int getSum(int[] arr){
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
    //求分数最大值
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i : arr) {
            if(i>max) max=i;
        }
        return max;
    }
}
