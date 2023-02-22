import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        System.out.println("Задача №1");

        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("сумма трат за месяц составила " + sum + " рублей");
    }
    public static int[] generateRandomArray(){
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task2() {
        System.out.println("Задача №2");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        for (int val : arr){
            System.out.println(val);
            if(val < min){
                min = val;
            }
            if (val > max){
                max = val;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей.");
    }

    private static void task3() {
        System.out.println("Задача №3");
        int arr[] = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        System.out.println("Cредняя сумма трат в месяц составила " + average + " рублей");
    }
    private static void task4() {
        System.out.println("Задача №4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}
