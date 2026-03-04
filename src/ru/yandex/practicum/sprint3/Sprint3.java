package ru.yandex.practicum.sprint3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Sprint3 {

    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> name2cost = new HashMap<>();
        ArrayList<Integer> ivanCosts = new ArrayList<>();
        ivanCosts.add(10);
        ivanCosts.add(15);
        ivanCosts.add(5);

        ArrayList<Integer> mashaCosts = new ArrayList<>();
        mashaCosts.add(25);
        mashaCosts.add(10);
        mashaCosts.add(30);

        name2cost.put("Ivan", ivanCosts);
        name2cost.put("Masha", mashaCosts);

        System.out.println(name2cost);

        for (ArrayList<Integer> cost : name2cost.values()){
            System.out.println(cost);
        }

        for (String name : name2cost.keySet()){
            System.out.println(name + " -> " + name2cost.get(name));
        }

        for (Map.Entry<String, ArrayList<Integer>> entry : name2cost.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\n---\n");

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (String name : name2cost.keySet()){
            ArrayList<Integer> costs = name2cost.get(name);


            for (Integer cost : costs){
                sum = sum + cost;
                if (cost > max){
                    max = cost;
                }
            }

//            System.out.println("Name: " + name);

        }

        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
    }
}
