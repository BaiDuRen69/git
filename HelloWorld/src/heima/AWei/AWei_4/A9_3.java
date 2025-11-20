package heima.AWei.AWei_4;

import java.util.Scanner;

public class A9_3 {
    static void main() {
//        查找元素
//    需求：
//        给定一个递增的有序数组和一个目标值，在数组中找到目标值，打印其索引。
//        如果目标值不存在于数组中，打印应插入的位置
//    举例1:
//        数据：nums = [1,3,5,6]；  target = 5
//        输出：2
//    举例2：
//        数据：nums = [1,3,5,6], target = 2
//        输出：1
//    举例3：
//        数据：nums = [1,3,5,6], target = 7
//        输出：4
//    分析：
//        本题有两种思路：
//        1. 思路一：直接从左到右遍历即可
//        2. 思路二：利用二分查找法，每次去掉一半。
        Scanner sc=new Scanner(System.in);
        int[] nums = {1, 3, 5, 6};
        System.out.print("当前数组为：");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("请输入要插入的元素：");
        int target = sc.nextInt();
        System.out.println("方法1输出："+"它将被插入在第"+(search(nums, target)+1)+"个");//调用方法1
        System.out.println("方法2输出："+"它将被插入在第"+(search2(nums, target)+1)+"个");//调用方法2
    }

//    方法1：利用遍历直接查找
    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
            if (target < nums[i]) {
                return i ;
            }
        }
        return nums.length;
    }

//    方法2：利用二分查找法完成
    public static int search2(int[] nums, int target) {
        //定义左右指针指向数组边界
        int left = 0;
        int right = nums.length - 1;
        //left，ringt都可能改变，所以用left <= right可以提升效率，减少循坏次数
        while (left <= right) {
            // 计算中间位置
            int mid = (left+right)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                // 目标值在右半部分，调整左边界
                left = mid+1;
            } else {
                // 目标值在左半部分，调整右边界
                right = mid-1;
            }
        }
        // 未找到目标值时，返回应该插入的位置
        return left;
    }
}
