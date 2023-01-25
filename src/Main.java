import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    private static void task1() {
        System.out.println("Задача 1");
        int[] payments = generateRandomArray();
        System.out.println(Arrays.toString(payments));
        int sum = 0;
        for (int i = 0; i < payments.length; i++) {
            sum = sum + payments[i];

        }
        System.out.println("Сумма трат за месяц составила" + sum + "рублей");
    }

       private static void task2() {
        System.out.println("Задача 2");
        int[] payments = generateRandomArray();
        System.out.println(Arrays.toString(payments));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < payments.length; i++) {
            if (payments[i] > max) {
                max = payments[i];
            }
            if (payments[i] < min) {
                min = payments[i];
            }
        }
        if (min != Integer.MAX_VALUE && max != Integer.MAX_VALUE) {
            System.out.println("Минимальная сумма трат за день составила" + min + "рублей. Максимальная сумма трат за день составила" + max + "рублей.");
        }
    }
    private static void task3() {
        System.out.println("Задача 3");
        int[] payments = generateRandomArray();
        System.out.println(Arrays.toString(payments));
        int sum = 0;
        for (int i = 0; i < payments.length; i++) {
            sum = sum + payments[i];
        }
            System.out.println("Средняя сумма трат за месяц составила " + (double) sum / payments.length + "рублей.");
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}


        


