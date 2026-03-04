package ru.yandex.practicum.sprint2;

import java.util.Arrays;

public class MethodsArguments {

    public static void main(String[] args) {
        int number = 5;

//        int[] number = {5};
        increment(number);

        number = incrementWithReturn(number);
//        System.out.println(number[0]);
        System.out.println(number);
    }

    public static void increment(int number){
        number = number + 1;
    }

    public static void increment(int[] numbers){
        numbers[0] = numbers[0] + 1;
    }

    public static int incrementWithReturn(int number){
        return number + 1;
    }
}
