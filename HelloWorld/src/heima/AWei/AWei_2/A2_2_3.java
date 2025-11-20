package heima.AWei.AWei_2;

public class A2_2_3 {

//2.3练习1 -红包余额

    /*微信余额：100元
    支付宝余额：10元
    银行卡余额：20元
    问题一：请问现在一共有多少钱？
    问题二：微信收了10元红包，又发了2元红包，余额多少？*/
    public static void main(String[] args) {
        int weixin = 100;
        int zhifubao = 10;
        int yinhangka = 20;
        int sum = weixin + zhifubao + yinhangka;
        System.out.println(sum);
        weixin += (10 - 2);
        System.out.println(weixin);
    }
}


