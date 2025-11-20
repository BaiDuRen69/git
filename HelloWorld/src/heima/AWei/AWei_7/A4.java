package heima.AWei.AWei_7;

public class A4 {
    public static void main(String[] args) {
//                    统计个数
//        需求：
//             学校选举学生会主席，有5个候选人
//             全校1000名同学参与投票（每人一票，可以弃权，或者选1-5号）。
//             投票使用Random模拟。0：弃权，1 ~ 5：给对应的候选人投票
//        要求1：
//             统计每个候选人的得票数和得票率，找出得票最多的候选人？
//        要求2：
//             统计弃票数和弃票率是多少？
//        思路分析：
//             1. 本题是利用数组进行统计
//             2. 数组中每个位置统计的内容是不一样的
        int[] arr = new int[6];
        for (int i = 0; i < 1000; i++) {
            int temp = (int) (Math.random() * 6);
            arr[temp]++;
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.println("第" + i + "个候选人的票数是：" + arr[i]);
        }
        System.out.println("弃票数是：" + arr[0]+"\t"+"弃票率为："+arr[0]/1000.0);
        int num = 0;
        int max = arr[1];
        for (int i = 2; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                num = i;
            }
        }

        System.out.println("第" + num + "个候选人票数最多，为：" + max);
    }
}
