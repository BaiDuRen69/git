package heima.AWei.AWei_4;

public class A8_2 {
    public static void main(String[] args){
//        求最值
//    需求：
//        已知数组元素为 {33,5,22,44,55}
//        请找出数组中最大值并打印在控制台
        int[] arr={33,5,22,44,55};
        int max=arr[0];
        for (int i : arr) {
            if(i>max) max=i;
        }
        System.out.println(max);
    }
}
