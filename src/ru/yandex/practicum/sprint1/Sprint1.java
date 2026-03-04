package ru.yandex.practicum.sprint1;

import java.util.Scanner;

public class Sprint1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = readInt(scanner);
//        String s = readString(scanner);
        System.out.println(n);

        scanner.close();
    }

    public static int readInt(Scanner scanner){
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Can't read a number");
            return -1;
        }
    }


}
