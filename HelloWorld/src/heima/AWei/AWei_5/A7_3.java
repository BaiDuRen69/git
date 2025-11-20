package heima.AWei.AWei_5;

public class A7_3 {
    public static void main(String[] args){
//        打印九九乘法表
//        需求：设计一个方法打印九九乘法表
            printMutiplicationTable();
    }
    public static void printMutiplicationTable(){
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(j+"x"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
