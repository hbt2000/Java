package Javanine;
import java.util.Random;

public class Radom {

        public static void main(String[] args) {
            int[] counts = new int[10];
            int[] sums = new int[100];
            for (int i = 0; i < 100; i++) {
                sums[i] = new Random().nextInt(10);
            }
            for (int i : sums) {
                counts[i]++;
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(i + "出现了：" + counts[i] + "次。");
            }
        }
}
