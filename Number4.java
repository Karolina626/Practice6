public class Number4 {
    public static void main(String[] args) {
        final int MAX_ANGLE = 90;
        final int VALUES_PER_LINE = 10;

        int gradysu = 0;
        int count = 0;

        System.out.println("Таблиця значень синусів (градуси -> синус):");

        while (gradysu <= MAX_ANGLE) {
            double radians = Math.toRadians(gradysu);
            double sin = Math.sin(radians);

            System.out.printf("%3d°: %.4f  ", gradysu, sin);
            gradysu++;
            count++;

            if (count % VALUES_PER_LINE == 0) {
                System.out.println();
            }
        }
        if (count % VALUES_PER_LINE != 0) {
            System.out.println();
        }
    }
}

