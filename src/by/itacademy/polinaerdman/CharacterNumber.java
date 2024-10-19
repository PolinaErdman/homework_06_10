package by.itacademy.polinaerdman;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();
        scanner.close();

        HashMap<Character, Integer> charMap = new HashMap<>();
        for(char ch : text.toCharArray()) {
            if (charMap.containsKey(ch))
                charMap.replace(Character.valueOf(ch), charMap.get(ch) + 1);
            else
                charMap.put(Character.valueOf(ch), 1);
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.println(entry.getKey() + " count is " + entry.getValue());
        }
    }
}
