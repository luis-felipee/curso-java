package Secao10;

import java.util.*;
import java.util.stream.Collectors;

public class Listas2 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Software");
        list.add("Engineer Machine");
        list.add("Engineer Mechanic");
        list.add(2,"Deep learning");
        System.out.println(list.size());
        for (String x : list){
            System.out.println(x);
        }

        System.out.println("-----------------");

//        list.removeIf(x -> x.charAt(0) == 'S');

        for (String x : list){
            System.out.println(x);
        }
        System.out.println("-------------------");
        System.out.println("Index of Software engineer: " + list.indexOf("Software"));
        System.out.println("Index of Deep learning: " + list.indexOf("Deep learning"));

        System.out.println("-------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
        for (String x : result){
            System.out.println(x);
        }
        System.out.println("-------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'E').findFirst().orElse(null);
        System.out.println(name);
    }
}
