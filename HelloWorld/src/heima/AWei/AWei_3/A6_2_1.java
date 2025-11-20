package heima.AWei.AWei_3;

public class A6_2_1 {
    static void main() {
//        循环打印1~100之间的数字，如果数字包含7或者是7的倍数，输出”过”
        for (int i = 1; i <= 100; i++) {
            if(i%7==0||i%10==7||i/10==7){
                System.out.print("过 ");
            }else{
                System.out.print(i+" ");
            }
            if(i%10==0) System.out.println();
        }
    }
}
