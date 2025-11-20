package heima.AWei.AWei_2;

public class A2_2_4 {
    public static void main(String[] args) {
       /* 2.4 练习2 - 游戏人物
        需求：
        我方：叉子           对方：长手
        攻击：220            攻击：210
        防御：85             防御：80
        血量：1012.5         血量：1223.3
        技能加成:  1.2       技能加成: 1.3

        技能造成伤害的公式：攻击力 * 技能加成 – 对方防御力
        普攻造成伤害的公式：攻击力 – 对方防御力

        计算：
        我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量？
        我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量？*/
        int attack1 = 220;
        int defense1 = 85;
        double blood1 = 1012.5d;
        float add1 = 1.2F;
        int attack2 = 210;
        int defense2 = 80;
        double blood2 = 1223.3d;
        float add2 = 1.3F;
        blood2-=(attack1-defense2);
        double harm2=attack1*add1-defense2;
//        System.out.println(blood2);
//        System.out.println(blood2-harm2);
        System.out.printf("%f%n",blood2);
        System.out.printf("%f",blood2-harm2);
    }
}