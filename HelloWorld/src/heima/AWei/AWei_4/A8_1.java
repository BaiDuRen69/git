package heima.AWei.AWei_4;

import java.util.Scanner;

public class A8_1 {
    public static void main(String[] args){
//        查找数据
//   需求：
//        已知数组元素为 {33,5,22,44,55,33}
//        键盘录入任意一个数据，查找这个数据在数组中是否存在
//        如果数组中要查找的数据出现多次，只要显示第一次的索引即可
//  输出要求：
//        如果存在打印索引
//        如果不存在，提示：“该数据不存在”
        int[] arr={33,5,22,44,55,33};
        Scanner sc= new Scanner(System.in);
        int input=sc.nextInt();
        for (int i=0;i<arr.length;i++) {
            if(input==arr[i]) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("该数据不存在");
    }
}
