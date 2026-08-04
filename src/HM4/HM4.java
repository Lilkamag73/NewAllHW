import java.util.Scanner;

public class HM4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        task1(scanner);
        task2(scanner);
        task3(scanner);
        task4(scanner);
        task5(scanner);
        scanner.close();

    }

    public static void task1(Scanner scanner) {
        int clientOS;
        System.out.println("Введите номер операционной системы (0 - iOS, 1 - Android): ");
        clientOS = scanner.nextInt();

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неверный номер операционной системы");
        }

    }

    public static void task2(Scanner scanner) {
        int clientOS;
        int clientDeviceYear = 2015;
        int deviceYear;

        System.out.println("Введите номер операционной системы (0 - iOS, 1 - Android): ");
        clientOS = scanner.nextInt();
        System.out.println("Введите год выпуска устройства: ");
        deviceYear = scanner.nextInt();

        boolean isNewDevice = (deviceYear < clientDeviceYear);

        if (!isNewDevice && clientOS == 0) {
            System.out.println("Установите полную версию приложения для iOS по ссылке");
        } else if (!isNewDevice && clientOS == 1) {
            System.out.println("Установите полную версию приложения для Android по ссылке");
        }
        if (isNewDevice && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (isNewDevice && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3(Scanner scanner) {
        int year;
        System.out.println("Введите год: ");
        year = scanner.nextInt();
        boolean isLeap;

        if (year <= 1584) {
            isLeap = year % 4 == 0;
        } else {
            isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        }

        if (isLeap) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4(Scanner scanner) {
        int deliveryDistance = 95;
        int deliveryDate;

        if (deliveryDistance <= 20) {
            deliveryDate = 1;
            System.out.println("Потребуется дней: " + deliveryDate);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDate = 2;
            System.out.println("Потребуется дней: " + deliveryDate);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDate = 3;
            System.out.println("Потребуется дней: " + deliveryDate);
        } else {
            System.out.println("Доставка не возможна");
        }
    }

    public static void task5(Scanner scanner) {

        int monthNumber = 12;


        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Выбранный вами месяй зимний");
                break;
            case 3, 4, 5:
                System.out.println("Выбранный вами месяц весенний");
                break;
            case 6, 7, 8:
                System.out.println("Выбранный вами месяц летний");
                break;
            case 9, 10, 11:
                System.out.println("Выбранный вами месяц осенний");
                break;
            default:
                System.out.println("Неверный номер месяца");
        }
    }


}