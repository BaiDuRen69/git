package heima.AWei.AWei_5;

public class A7_1 {
    static void main() {
//             去除重复元素
//      需求：
//        获取10个1-100之间的随机数并存入到数组当中,要求保证数据是唯一的
        int[] arr=new int[10];
        run1(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void run1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //定义count 用于判断生成的数是否和之前生成的数相等
            boolean count=true;
            //随机生成1到100的数
            //用temp接收，再进入循坏，判断生成的数是否和之前生成的数相等，相等则i--，重新生成
            int temp=(int)(Math.random()*100+1);
            for (int j = 0; j < i; j++) {
                if(temp==arr[j]){
                    i--;
                    count=false;
                }
            }
            //若count为true（即没有发生变化），则将生成的数存入数组
            if(count) arr[i]=temp;
        }
    }
}
