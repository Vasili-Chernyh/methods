public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2028;
        definesYear(year);
    }

    public static void definesYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2011;
        definesProgram(clientOS, clientDeviceYear);
    }

    public static void definesProgram(int os, int version) {
        if (version <= 2015) {
            System.out.print("Установите облегченную версию приложения ");
        } else
            System.out.print("Установите обычную версию приложения ");
        if (os == 1) {
            System.out.println("для Android по ссылке");
        } else
            System.out.println("для iOS по ссылке");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 101;
        checkingDistance(deliveryDistance);
        int zone = checkingDistance(deliveryDistance);
        switch (zone){
            case 1:
            System.out.println("Потребуется дней: " + zone);
            break;
            case 2:
            System.out.println("Потребуется дней: " + zone);
            break;
            case 3:
            System.out.println("Потребуется дней: " + zone);
            break;
            default:
            System.out.println("Доставки нет");
        }
    }

    public static int checkingDistance (int distance) {
        if (distance <= 20) {
            int deliveryTime = 1;
            return deliveryTime;
        } else if (distance > 20 && distance <= 60) {
            int deliveryTime = 2;
            return deliveryTime;
        } else {
            int deliveryTime = 3;
            return deliveryTime;
        }
    }
}