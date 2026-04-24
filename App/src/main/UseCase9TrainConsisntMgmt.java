package main;

import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return type + " Bogie | Capacity: " + capacity;
    }
}

public class UseCase9TrainConsisntMgmt {

    // ✅ UC9 Core Logic
    public static Map<String, List<Bogie>> groupBogiesByType(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));
    }

    // Optional main method for manual run
    public static void main(String[] args) {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 60),
                new Bogie("Sleeper", 80),
                new Bogie("First Class", 50)
        );

        Map<String, List<Bogie>> grouped = groupBogiesByType(bogies);

        grouped.forEach((type, list) -> {
            System.out.println(type + ":");
            list.forEach(System.out::println);
        });
    }
}