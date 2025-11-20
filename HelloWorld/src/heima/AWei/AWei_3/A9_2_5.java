package heima.AWei.AWei_3;

public class A9_2_5 {
    public static void main(String[] args){
//        打印九九乘法表
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"x"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------------");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"+"+j+"="+(i+j)+"\t");
            }
        System.out.println();
        }
    }
}
