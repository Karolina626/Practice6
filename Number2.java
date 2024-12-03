import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Number2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введіть кількість кутів: ");
        int bagatokytnik = sc.nextInt();
        int sum = 0;
        int[] kyti = new int[bagatokytnik];
        for(int i = 0; i < kyti.length; ++i)
            kyti[i] = random.nextInt(0, 90);
        for(int sumakytiv : kyti)
            sum += sumakytiv;
        System.out.printf(Arrays.toString(kyti) + " Сума: " + sum);

            if(sum >= 180) {
                System.out.printf("\nТакого не існує ");
            }else if(sum <= 180) {
                System.out.printf("\nІснує");
            }
    }
}
