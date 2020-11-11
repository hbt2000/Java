package Javanine;

import java.util.Scanner;

public class RankScore{
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        float [] place = new float[5];
        String [] name = new String[5];
        System.out.println("请输入5位同学的名字和分数！！！");
        for (int i = 0; i < 5; i++) {
            System.out.println("输入"+"第"+(i+1)+"学生的姓名：");
            name[i] = imput.next();
            System.out.println("输入"+"第"+(i+1)+"学生的分数：");
            place[i] = imput.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(place[i]>place[j]){
                    float t=place[i];
                    place[i]=place[j];
                    place[j]=t;

                    String tem=name[i];
                    name[i]=name[j];
                    name[j]=tem;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("第"+(i+1)+"名是："+" "+name[i]+"分数："+place[i]);
        }
    }
}
