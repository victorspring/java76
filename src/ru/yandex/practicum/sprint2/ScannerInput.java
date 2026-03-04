package ru.yandex.practicum.sprint2;

import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
//        System.out.println(readNumberInLoopUsingScannerNextInt());
        System.out.println(readNumberInLoopUsingScannerNextLine());
    }

    public static int readNumberInLoopUsingScannerNextInt() {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true){
            System.out.println("Введите число");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Вы ввели: " + number);
                break;
            } else {
                System.out.println("Ошибка");
                scanner.nextLine();
            }
        }
        scanner.close();

        return number;
    }

    public static int readNumberInLoopUsingScannerNextLine(){
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true){
            System.out.println("Введите число");
            try {
                number = Integer.parseInt(scanner.nextLine().trim());
                System.out.println("Вы ввели: " + number);
                break;
            } catch (NumberFormatException e){
                System.out.println("Ошибка");
            }
        }
        scanner.close();

        return number;
    }

}
