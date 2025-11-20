package heima.AWei.AWei_7;

import java.util.Scanner;

public class A1 {
    static void main() {
//       1. 移除元素
//        需求：
//        给你一个数组 nums1 和一个值 val，你需要删除所有数值等于 val 的元素
//       举例1：
//        输入：nums1 = [3,2,2,3]    val = 3
//        输出：nums1 = [2,2]  剩余2个元素
//       举例1：
//        输入：nums1 = [0,1,2,2,3,0,4,2]    val = 2
//        输出：nums1 = [0,1,4,0,3]  剩余5个元素
//       思路分析：
//        1. 假设数组中的数据：2, 2, 1, 1, 2, 2, 3, 3, 3, 3，删除2之后：1, 1, 3, 3, 3, 3
//        2. 我们可以利用双指针，也叫做快慢指针实现
//        3. 慢指针:存入的位置
//        4. 快指针:找数字2
//        5. 比较两个指针对应的数据，如果是2，舍弃快指针位置的数据。如果不是2，快指针的数据存入慢指针位置。
        Scanner sc=new Scanner(System.in);
        System.out.println("当前数组为：");
        int[] nums1 = {2, 2, 1, 1, 2, 2, 3, 3, 3, 3};
        int[] nums2 = {0,1,2,2,3,0,4,2};
        printArray(nums1, nums1.length);//输出数组nums1
        printArray(nums2, nums2.length);//输出数组nums2
        System.out.println("请输入要删除的元素：");
        int input =sc.nextInt();
        int count1=deleteElement1(nums1, input);
        int count2=deleteElement2(nums2, input);
        printArray(nums1, count1);//输出数组nums1
        printArray(nums2, count2);//输出数组nums2
    }
    //第一种方法
    public static int deleteElement1(int[] nums,int slow){
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(slow==nums[i]) continue;//跳过等于slow的数据
            nums[count]=nums[i];
            count++;
        }
        return count;//返回剩余的元素个数
    }
    //第二种方法
    public static int deleteElement2(int[] nums,int val){
        int fast =0;//快指针
        int slow=0;//慢指针
        while(fast <nums.length){
            if(nums[fast]!=val){
                nums[slow]=nums[fast];//快指针的数据存入慢指针位置
                slow++;
            }
            fast++;
        }
        return slow;//返回剩余的元素个数
    }
    //输出数组
    public static void printArray(int[] arr,int count){
        for (int i = 0; i < count; i++) {
            if(i==0) System.out.print("[");
            if(i==count-1) {
                System.out.print(arr[i]+"]\t");
                System.out.println("剩余"+count+"个元素");
                break;
            }
            System.out.print(arr[i]+",");
        }
    }
}
