package heima.AWei.AWei_4;

public class A8_3 {
    public static void main(String[] args){
//        打乱数据
//        需求：
//        已知数组元素为 {1,2,3,4,5,6,7,8,9,10}
//        要求：打乱数组中的数据
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int random=(int)(Math.random()*10);

        for (int i = 0; i < arr.length; i++) {
            int temp=arr[i];
            arr[i]=arr[random];
            arr[random]=temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
