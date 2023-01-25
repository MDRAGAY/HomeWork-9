import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();

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

        // Объявить метод «сгенерироватьМассив»
        public static int[] generateRandomArray () {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }
    }
        


