package heima.AWei.AWei_7;

import java.util.Random;
import java.util.Scanner;

public class A6 {
    static void main(){
//        6. 大乐透
//        需求：
//        号码介绍：
//        大乐透选号规则明确规定:同一投注区内的号码不可重复，但不同投注区之间允许号码重复。
//        具体规则可分为前区和后区两个维度:
//
//        大乐透选号重复规则详解
//        1.前区号码不可重复。
//            - 投注范围:从01-35中选择5个号码。
//            - 规则要求:所选5个号码之间不可出现重复数字，如出现重复则该注视为无效投注。
//        2.后区号码不可重复。
//            - 投注范围:从01-12中选择2个号码。
//            - 规则要求:所选2个号码之间不可重复，否则同样视为无效投注。跨区重复规则。
//        前区与后区号码允许交叉重复，例如前区选10，后区也可选10。
//        系统自动判定:跨区重复不会触发错误提示，属于有效投注。
//
//        玩法知识延伸
//        基本结构：采用"5+2"双区投注模式，前区35选5与后区12选2组合形成完整投注号码。
//        无效投注判定：同一区内重复号码在开奖前会被系统自动识别为无效票，无法参与兑奖。
//        策略提醒：虽然跨区重复有效，但统计显示前区与后区号码重复率仅3.8%，建议选号时优先考虑号码分布合理性。
//        思路分析：
//            本题其实就是能理解大乐透彩票号码的规则即可：
//                - 前五个号码（也叫红球）：01-35中选择5个号码，数据不能重复。
//                - 后两个号码（也叫蓝球）：01-12中选择2个号码，数据不能重复。
//                - 但是同一个号码在红球中选择后，蓝球中也可以选择。
//            号码结构如下：
//            - 中奖规则：
//                  一等奖：5 + 2
//                  二等奖：5 + 1
//                  三等奖：5 + 0 / 4 + 2
//                  四等奖：4 + 1 / 3 + 2
//                  五等奖：4 + 0 / 3 + 1 / 2 + 2
//                  六等奖：3 + 0 / 1 + 2 / 2 + 1 / 0 + 2
        System.out.print("中奖号码为：");
        int[] arr=winningNumber();
        print(arr);
        System.out.println("请输入你要猜的号码：");
        int[] arr1=inputNumber();
        System.out.print("你最终输入的号码为：");
        print(arr1);
        winOrNot(arr1,arr);
    }
    // 生成中奖号码
    public static int[] winningNumber(){
        int[] arr=new int[7];
        Random r=new Random();
        // 生成5个前区号码
        for (int i = 0; i < 5; i++) {
            int sum=r.nextInt(35)+1;
            arr[i]=sum;
            // 判断是否重复，传入i防止死循环，同时提升效率
            // 若重复则返回true，则i--，重新生成
            if(judge(arr,i)){
                i--;
            }
        }
        // 生成2个后区号码
        for (int i = 5; i < 7; i++) {
            int sum=r.nextInt(12)+1;
            arr[i]=sum;
            if(judge(arr,i)){
                i--;
            }
        }
        return arr;
    }
    // 输入要猜的号码
    public static int[] inputNumber(){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[7];
        for (int i = 0; i < 5; i++) {
            int num=sc.nextInt();
            arr[i]=num;
            if(judge(arr,i)){
                System.out.println("输入的前区号码重复，请重新输入：");
                i--;
                continue;
            }
            if(num<1||num>35){
                System.out.println("输入的前区号码不在范围内，请重新输入：");
                i--;
            }
        }
        for(int i = 5; i < 7; i++){
            int num=sc.nextInt();
            arr[i]=num;
            if(judge(arr,i)){
                System.out.println("输入的后区号码重复，请重新输入：");
                i--;
                continue;
            }
            if(num<1||num>12){
                System.out.println("输入的后区号码不在范围内，请重新输入：");
                i--;
            }
        }
        return arr;
    }
    // 判断是否重复
    public static boolean judge(int[] arr,int num){
        //由于前区和后区数据可以相同，所以要分开判断
        //当num<5，则判断前区数据
        for(int i=0;i<num&&num<5;i++){
            if(arr[i]==arr[num]){
                return true;
            }
        }
        for(int i=5;i<num;i++){
            if(arr[i]==arr[num]){
                return true;
            }
        }
        return false;
    }
    // 输出数组
    public static void print(int[] arr){
        System.out.print("[");
        for (int i =0;i<arr.length;i++) {
            if(i==arr.length-1) System.out.print(arr[i]+"]");
            else System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
    //判断是否中奖
    public static void winOrNot(int[] arr1,int[] arr2){
        //只要有数据相同，就算一个球，没有顺序
        int count1=0;   //红球的个数
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr1[i]==arr2[j]) count1++;
            }
        }
        int count2=0;   //蓝球的个数
        for (int i = 5; i < 7; i++) {
            for(int j = 5; j < 7; j++){
                if(arr1[i]==arr2[j]) count2++;
            }
        }
        if(count1==5&&count2==2){
            System.out.println("恭喜你，中奖了一等奖");
        }else if(count1==5&&count2==1){
            System.out.println("恭喜你，中奖了二等奖");
        }else if(count1==5&&count2==0||count1==4&&count2==2){
            System.out.println("恭喜你，中奖了三等奖");
        }else if(count1==4&&count2==1||count1==3&&count2==2){
            System.out.println("恭喜你，中奖了四等奖");
        }else if(count1==4&&count2==0||count1==3&&count2==1||count1==2&&count2==2){
            System.out.println("恭喜你，中奖了五等奖");
        }else if(count1==3&&count2==0||count1==2&&count2==1||count1==1&&count2==2||count1==0&&count2==2){
            System.out.println("恭喜你，中奖了六等奖");
        }
    }
}
