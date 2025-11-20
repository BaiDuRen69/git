package heima.AWei.AWei_3;

public class A4_2_3 {
    /*  世界最高山峰珠穆朗玛峰高度是：8848.86米=8848860毫米，
        假如我有一张足够大的纸，它的厚度是0.1毫米。
       请问：该纸张折叠多少次，可以折成珠穆朗玛峰的高度？*/
    public static void main(String[] args){
        double h=8848860;
        double t;
        int sum=0;
        for(t=0.1;t<=h;t*=2){
            sum++;
        }
        System.out.println(sum);
    }
}