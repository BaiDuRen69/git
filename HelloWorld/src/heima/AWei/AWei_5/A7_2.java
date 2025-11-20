package heima.AWei.AWei_5;

public class A7_2 {
    static void main() {
//        数组遍历
//        需求：设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如：[11, 22, 33, 44, 55]
//        思路：
//  ①因为要求结果在一行上输出，所以这里需要在学习一个新的输出语句System.out.print(“内容”);
//        - System.out.println(“内容”); 输出内容并换行
//                - System.out.print(“内容”); 输出内容不换行
//                - System.out.println(); 起到换行的作用
//  ②定义一个数组，用静态初始化完成数组元素初始化
//  ③定义一个方法，用数组遍历通用格式对数组进行遍历
//  ④用新的输出语句修改遍历操作
//  ⑤调用遍历方法
        int[] arr = {11, 22, 33, 44, 55};
        printarr(arr);
    }
    public static void printarr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1) System.out.print(arr[i]+"]");
            else System.out.print(arr[i]+", ");
        }
    }
}
