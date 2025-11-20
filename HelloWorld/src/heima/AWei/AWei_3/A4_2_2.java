package heima.AWei.AWei_3;

public class A4_2_2 {
    static void main() {
//        假设你在银行投资了100000元，银行给出的复利是1.7%，问多少年后能实现本金翻倍？
        double money=100000,temp=money;
        double lixi=0.017;
        int year;
        for (year=0;  money<2*temp ; year++) {
            money+=money*lixi;
        }
        System.out.println(year);
    }
}
