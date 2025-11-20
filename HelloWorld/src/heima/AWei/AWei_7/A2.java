package heima.AWei.AWei_7;

import java.util.Random;

public class A2 {
//               红包问题
//    需求：
//    给你两个整数M和N，M表示红包的总额， N表示红包的个数
//    现在有N个人来抽红包，每个人都是随机的，打印每个人领的红包金额
//    思路分析：
//            本道题不是单纯随机就可以的，假设200元5个红包，直接5次随机有可能会遇到很多问题：
//            1. 前面的人把钱都领完了，后面的人领不到了
//            2. 5个人随机的总额不是红包总额
//    注意本题的几个坑：
//            1. 每个人最少1分钱
//            2. 每个人领完红包之后，至少预留 1*N 分钱
//               第一个人：至少预留4分钱
//               第二个人：至少预留3分钱
//               第三个人：至少预留2分钱
//               第四个人：至少预留1分钱
//            3. 最后一个人是拿剩余的总额，不随机
    public static void main(String[] args){
        int M=20000;//红包总额
        int N=5;//红包个数
        Random random=new Random();
        for (int i =1; i <= N; i++) {
            int temp= random.nextInt(M-(N-i))+1;
            if(i==N){
                temp=M;//最后一个人
            }
            System.out.println("第"+i+"个人抢到"+temp);
            M-=temp;//剩余金额
        }
    }
}
