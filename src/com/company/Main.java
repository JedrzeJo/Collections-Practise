package com.company;

import java.io.Console;
import java.util.*;
import java.util.function.BiConsumer;
import static javafx.scene.input.KeyCode.V;

public class Main {

    public static void main(String[] args) {



        /*  // Exercise 1 - List + Set
        Scanner scanner = new Scanner(System.in);
        List<String> listOfNames = new ArrayList<>();
        System.out.println("Type names of persons You'd like to add to Your List.\nButton '-' will finish the process.");
        String stopper=new String("-");
        while (true) {
            listOfNames.add(scanner.next());
            if (listOfNames.contains(stopper)) {break;}
        }
        Set<String> setOfNames = new HashSet<>();
        setOfNames.addAll(listOfNames);

        for (String name : setOfNames) {
            System.out.println(name);       //displays names, without repeats(set instead of list)
        }
        */



        // Exercise 2 - Map
       /* Scanner scanner = new Scanner(System.in);
        Map<String, String> mapOfPairs = new HashMap<>();
        String stopper=new String("-");
        System.out.println("Enter name of 1st and 2nd partner to create couples.\nType '-' to end process. ");
        while(true)
        {
            mapOfPairs.put(scanner.next(), scanner.next());
            if(mapOfPairs.containsValue(stopper) || mapOfPairs.containsKey(stopper)) {break;}
        }

        for(Map.Entry<String, String> entry : mapOfPairs.entrySet() )
        {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" "+value);

        }
        */



        //Exercise 3 - checking Map methods
        Map<String, String> pairsMap = new HashMap<>();
        pairsMap.put("Marcin", "Adela");
        pairsMap.put("Marek", "Magda");

        Map<String, String> otherPairsMap = new HashMap<>();
        otherPairsMap.put("Marek", "Ewa");
        otherPairsMap.put("Adam", "Ewa");

        pairsMap.putAll(otherPairsMap);

        System.out.println(pairsMap.get("Marek"));
        System.out.println(pairsMap.remove("Marek"));
        System.out.println(pairsMap.size());
        System.out.println(pairsMap.isEmpty());
        System.out.println(pairsMap.containsKey("Jan"));
        System.out.println(pairsMap.containsValue("Adela"));
    };
}
