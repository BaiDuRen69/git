package heima.AWei.AWei_7;

public class A5 {
    public static void main(String[] args) {
//                                接雨水
//    需求：
//    给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水
//    输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
//    输出：6
//    解释：下面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）
//    思路分析：
//    1. 本题利用动态规划DP思想，把大问题拆成小问题，再找到大问题的最优解。
//    2. 要注意的是数组里面每一个数字，其实就是柱子的高度
//            0：高度为0
//            1：高度为1
//            2：高度为2
//    3. 柱子有了，接下来就下雨，问题就是，雨停了，蓝色表示的水能留下多少？
//    4. 雨水留下的核心其实就是看左边和右边有没有柱子挡着，如果有，雨水能留下，如果没有雨水流走。最终能留下的雨水如图所示：
//    5. 既然雨水是否留下看左右的柱子，那么我们就可以把问题拆成两部分，
//        1. 假设右边有一个无限高的柱子，水无法从右边流走，只能从左边流走。
//        2. 假设左边有一个无限高的柱子，水无法从左边流走，只能从右边流走。
//        3. 再计算两个的交集就能得到最终的结果。
//        6. 假设右边有无限高的柱子的情况，相当于此时，有人从左往右看有多少单位的雨水能留下
//        7. 假设左边有无限高的柱子的情况，相当于此时，有人从右往左看有多少单位的雨水能留下
//        8. 合并，取交集
//        代码解析：
//        先来看从左往右看的情况，直接统计蓝色的雨水不方便，我们可以先统计柱子加雨水总单位，
//        最后再减去柱子的面积即可。最终，我想记录的结果是 0 1 1 2 2 2 2 3 3 3 3
//
//    具体实现步骤：
//        1. 第三方变量，这个变量表示，目前最高的柱子。第一个柱子，高度为0，变量就记
//        如图所示：
//
//        2. 拿着他跟后面的数据进行比较，记录当前柱子和雨水的
//        如果遇到更高的柱子，就记录柱子的
//        如果遇到更矮的柱子，就记录当前变量中记录的数据。
//
//        3. 当所有的数据比较完毕之后，从左往右看的就已经统计完毕。
//
//        4. 同理，从右往左，也是一样的逻辑，只不过就是倒着遍历，这样就可以获取到两组数据。如图所示：
//
//        5. 合并两个数组，取最小值。
//
//        6. 减去柱子的高度，就是最终的结果。
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("原始数组为：");
        arrPrint(height);
        int[] len1 = new int[height.length];
        leftLook(height, len1);
        System.out.println("从左往右看：");
        arrPrint(len1);
        int[] len2 = new int[height.length];
        rightLook(height, len2);
        System.out.println("从右往左看：");
        arrPrint(len2);
        int[] len = new int[height.length];
        merge(len1, len2, len);
        System.out.println("合并：");
        arrPrint(len);
        System.out.println("最终结果为：" + (sum(len)-sum(height)));
    }

    // 从左往右看，能看到的石柱的高度
    public static void leftLook(int[] height, int[] len) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
            }
            len[i] = max;
        }
    }

    // 从右往左看，能看到的石柱的高度
    public static void rightLook(int[] height, int[] len) {
        int max = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            if (height[i] > max) {
                max = height[i];
            }
            len[i] = max;
        }
    }
    // 合并两个数组，取交集（最小值）
    public static void merge(int[] len1, int[] len2, int[] len) {
        for (int i = 0; i < len.length; i++) {
            len[i]=Math.min(len1[i], len2[i]);
        }
    }
    // 数组个元素之和
    public static int sum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    // 打印数组
    public static void arrPrint(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
