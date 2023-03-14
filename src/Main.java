public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int year = 2028;
        definesYear(year);
    }
    public static void definesYear ( int a){
            if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {

                System.out.println(a + " является високосным");
            } else {
                System.out.println(a + " не является високосным");
            }
        }
    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2011;
        definesProgram (clientOS, clientDeviceYear);
    }
    public static void definesProgram (int a, int b) {
        if (b <= 2015) {
            System.out.print("Установите облегченную версию приложения ");
        } else
            System.out.print("Установите обычную версию приложения ");
        if (a == 1) {
            System.out.print("для Android по ссылке");
        } else
            System.out.print("для iOS по ссылке");
        }
    public static void task3 () {
        System.out.println("Задача 3");
        int deliveryDistance = 12;
        checkingDistance(deliveryDistance);
    }
    public static void checkingDistance (int distance){
        if (distance <= 20){
            int deliveryTime = 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (distance > 20 && distance <= 60){
            int deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (distance > 60 && distance <= 100){
            int deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }
    }
}