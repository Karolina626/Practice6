import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть розмір масиву: ");
        int x = sc.nextInt();
        Random random = new Random();
        int[] mass = new int[x];
        for (int i = 0; i < mass.length; ++i) {
            mass[i] = random.nextInt(0, 100);
        }
        if (x <= 1) {
            System.out.println("Невірний розмір: ");
        } else {
            System.out.println(Arrays.toString(mass));
            Scanner sc1 = new Scanner(System.in);
            System.out.printf("Оберіть опцію: 1 - зростає, 2 - спадає ");
            int chose = sc1.nextInt();
            switch (chose) {
                case 1:
                    System.out.printf("На Зростання: ");
                    break;
                case 2:
                    System.out.printf("На Спадання: ");
                    break;
            }

            if (mass[1] > mass[0]) {
                System.out.printf("Масив Зростає");
            } else if (mass[1] > mass[0]) {
                System.out.printf("Масив Спадає");

            }
        }
    }
}