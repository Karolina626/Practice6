import java.util.Arrays;
import java.util.Random;

public class Number1 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        Random random = new Random();
        for(int i = 0; i < mass.length; ++i)
            mass[i] = random.nextInt(0,100);
        System.out.printf(Arrays.toString(mass));

        int even = 0;
        int odd = 0;


        for(int num : mass) {
            if (num % 2 == 0) {
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("\nКількість парних чисел: " + even++ );
        System.out.println("Кількість непарних чисел: " + odd++);
    }
}