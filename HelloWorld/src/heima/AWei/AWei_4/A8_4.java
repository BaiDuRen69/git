package heima.AWei.AWei_4;

public class A8_4 {
    public static void main(String[] args){
//        去除重复元素
//   需求：
//        获取10个1-100之间的随机数并存入到数组当中,要求保证数据是唯一的
        int[] arr=new int[100];
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            arr[i]=(int)(Math.random()*100+1);
            for (int j = i; j > 0; j--) {
                if(arr[i]==arr[j-1]) {
                    count++;
                    break;
                }
            }
            if(count==1) i--;
        }
        for (int i = 1; i <= arr.length; i++) {
            System.out.print(arr[i-1] + "\t");
            if(i%10==0) System.out.println();
        }
    }
}
