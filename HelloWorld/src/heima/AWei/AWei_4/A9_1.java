package heima.AWei.AWei_4;

import java.util.Scanner;

public class A9_1 {
    public static void main(String[] args) {
//        两数之和
//    需求：
//        给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那两个 整数，并输出它们的数组索引。
//    提示：先不用考虑效率问题，两层循环即可完成
//    要求1：只要输出第一对满足要求的情况
//    要求2：输出所有满足要求的情况
//    举例1:
//        输入：数组nums = [2, 7, 11, 15]  target = 9
//        输出：0,1
//        解释：因为 nums[0] + nums[1] == 9 ，所以结果为0和1
//    举例2:
//        输入：数组nums = [3, 2, 4]  target = 6
//        输出：1,2
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入十个数组元素：");
        int[] nums = new int[10];
        int k = 0;
        while (k < nums.length) {
            nums[k] = sc.nextInt();
            k++;
        }
        System.out.println("请输入目标值：");
        int target = sc.nextInt();
        boolean found = true;//判断是否找到，找到为false，39行不会输出，否则会输出
        //双重循环求和，if判断输出
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(i + "," + j);
                    found = false;
                }
            }
        }
        if (found) System.out.println("没有找到");
    }
}
