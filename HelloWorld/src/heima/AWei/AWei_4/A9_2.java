package heima.AWei.AWei_4;

public class A9_2 {
    static void main() {
//        合并有序数组
//    需求：
//        给你两个有序数组 arr1 和 arr2
//        将两个数组中的数据合并到一个大数组中。
//        要求：合并之后的大数组也是有序的
//    举例1：
//        arr1：1 3 5 7 9
//        arr2：2 4 6 8 10
//        arr3：1 2 3 4 5 6 7 8 9 10
        int[] arr1 = {1, 3, 5, 7, 9, 10, 55};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] arr3 = new int[arr1.length + arr2.length];
        int j = 0, k = 0;
        for (int i = 0; i < arr3.length; i++) {
            //将以下两个if判断放在前面，避免k，j索引越界
            //当其中一个数组已经遍历完，则将另一个数组的元素全部录入
            if (j == arr1.length) {
                arr3[i] = arr2[k];
                k++;    //k，j自己递增使所在数组元素全部录入
                continue;
            }
            if (k == arr2.length) {
                arr3[i] = arr1[j];
                j++;
                continue;
            }
            //arr3从小到大，小的先录入，录入后指针加1，指向下一个元素
            if (arr1[j] < arr2[k]) {
                arr3[i] = arr1[j];
                j++;
            } else {
                arr3[i] = arr2[k];
                k++;
            }
        }
        for (int l = 0; l < k + j; l++) {
            System.out.print(arr3[l] + " ");
        }
    }
}
