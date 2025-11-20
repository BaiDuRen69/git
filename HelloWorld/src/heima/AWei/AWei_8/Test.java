package heima.AWei.AWei_8;

public class Test {
    private String name;
    private int age;

    // 1. 无参构造器
    public Test() {
        // 调用本类中带两个参数的构造器，并提供默认值
        System.out.println("无参构造器被调用");
        this("未知姓名", 0);
    }

    // 2. 带一个参数的构造器
    public Test(String name) {
        // 调用本类中带两个参数的构造器
        this(name, 0);
        System.out.println("单参构造器被调用");
    }

    // 3. 带两个参数的构造器
    public Test(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("双参构造器被调用");
    }
}
