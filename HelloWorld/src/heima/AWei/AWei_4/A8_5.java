package heima.AWei.AWei_4;

public class A8_5 {
    public static void main(String[] args){
//        给定义一个递增有序数组，去除其中重复元素
        int[] arr = {1, 1, 2, 2, 2, 2, 3, 3, 3, 3};
        int tet=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[tet]){
                tet++;
                arr[tet]=arr[i];
            }
        }
        for (int i = 0; i <= tet; i++) {
            System.out.println(arr[i]);
        }
    }
}
