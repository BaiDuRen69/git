package heima.AWei.AWei_7;

public class A3 {
    //                  中位数
//    需求：
//             给定两个正序数组 arr1和arr2，请先合并数组，并找出合并之后数组的中位数。
//    举例：
//            1 2 3 4 5 6 7 8 9中位数：5
//            1 2 3 4 5 6中位数： （ 3+4 ） /2
//    思路分析：
//            1.本题可采取二路归并思想
//            2.比较两个指针位置的数据，把小的放到大数组中即可
//    注意本题的坑：
//            如果数组长度不一样，当A数组全部存完，另外一个数组就不需要比较了，直接存入即可
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print("数组arr1为：");
        arrPrint(arr1);
        printMedian(arr1);
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        System.out.print("数组arr2为：");
        arrPrint(arr2);
        printMedian(arr2);
        int len = arr1.length + arr2.length;
        int[] arr = new int[len];
        //定义两个指针，分别指向两个数组的索引位置
        int count1 = 0, count2 = 0;
        for (int i = 0; i < len; i++) {
            //将以下两个if判断放在前面，避免索引越界
            //当其中一个数组已经遍历完，则将另一个数组的元素全部录入
            if (count1 == arr1.length) {
                arr[i] = arr2[count2];
                count2++;
                continue;
            }
            if (count2 == arr2.length) {
                arr[i] = arr1[count1];
                count1++;
                continue;
            }
            //arr3从小到大，小的先录入，录入后指针加1，指向下一个元素
            if (arr1[count1] < arr2[count2]) {
                arr[i] = arr1[count1];
                count1++;
            } else {
                arr[i] = arr2[count2];
                count2++;
            }
        }
        System.out.print("合并后的数组为：");
        arrPrint(arr);
        printMedian(arr);

    }
    //中位数打印
    public static void printMedian(int[] arr) {
        int len = arr.length;
        double mid ;
        //分数组长度讨论
        //当len为偶数时，中位数为中间两个数的平均数
        //当len为奇数时，中位数为中间的数
        if (len % 2 == 0) {
            mid = (arr[len / 2 - 1] + arr[len / 2]) / 2.0;
        } else {
            mid = arr[(len - 1) / 2];
        }
        System.out.println("中位数为：" + mid);
    }

    //数组打印
    public static void arrPrint(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
