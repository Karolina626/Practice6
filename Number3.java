import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть розмір: ");
        int some_size = sc.nextInt();
        int[] mass = new int[some_size];
        for(int i = 0; i < mass.length; ++i)
            mass[i] = random.nextInt(1, 5);
        System.out.println(Arrays.toString(mass));
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Введіть значення яке потрібно замінити:  ");
            int x = sc1.nextInt();
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Значення: ");
            int y = sc2.nextInt();
        boolean isReplaced = false;
        for (int i = 0; i < some_size; i++) {
            if (mass[i] == x) {
                mass[i] = y;
                isReplaced = true;

            }
            if (isReplaced) {
                System.out.println("Оновлений масив:");
                for (int value : mass) {
                    System.out.print(value + " ");
                }
                System.out.println();
            } else {
                System.out.println("Значення " + x + " не знайдено в масиві.");
            }

            sc1.close();
        }
    }
}
