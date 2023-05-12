package hw;

import java.util.*;

public class Starter {
    public static void main(String[] args) {
        Solutions solutions = new Solutions();
        List<Integer> nums = new ArrayList<>(List.of(1, 3, 4, 4, 5, 5, 6, 2, 2,
                2, 10, 10, 1, 15, 12));

        List<String> words = new ArrayList<>(List.of("corner", "work", "home", "home",
                "extinguish", "malice", "work", "malice"));

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три",
                "три", "четыре", "четыре"));

        solutions.printOnlyOddNums(nums);
        solutions.printEvenNumsOnce(nums);
        solutions.printUniques(words);
        solutions.printAmountOfEachElement(strings);
    }
}
