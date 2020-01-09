package OOP.lab3;

import java.util.*;

public class Text {
    public int countwords(String text) {
        String[] words = text.split("([\\s])");
        return words.length;
    }

    public int countsentences(String text) {
        String[] sentences = text.split("[!?.:]+");
        return sentences.length;
    }

    public int countletters(String text) {
        String letters = text.replaceAll("[^A-z]", "");
        return letters.length();}

    public void countVowelsAndConsonants(String text) {
        text = text.toLowerCase();
        int vowels = 0, consonants = 0, spaces = 0;
        for (int i = 0; i < text.length(); ++i) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                ++vowels;
            } else if ((ch >= 'a' && ch <= 'z')) {
                ++consonants;
            } else if (ch == ' ') {
                ++spaces;
            }
        }
        System.out.println("Number of vowels:" + vowels + "\n" + "Number of consonants:" + consonants + "\n" + "Number of spaces:" + spaces);
    }


    public void countMostRepeatedWord(String text) {
        int count;
        int maxCount = 0;
        String word;
        ArrayList<String> words = new ArrayList<>();
        String[] newText = text.toLowerCase().split("[,.!?;|[0-9]\\s]+");
        for (String s : newText) {
            words.add(s);
        }

        for (int i = 0; i < words.size(); i++) {

            count = 1;
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j))) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                word = words.get(i);
                System.out.println("The word <" + word + "> repeats " + maxCount + " times");
                System.out.println("Most repeated word:" + word);
            }
        }

    }

    public static void longestWord(String text) {
        String[] longw = text.split("([,.!?;|0-9\\s]+)");
        Arrays.toString(longw);
        String longWord = " ";
        for (int i = 0; i < longw.length; i++) {
            //for (int j = i + 1; j < longw.length; j++) {
            if (longw[i].length() >= longWord.length()) {
                longWord = longw[i];
            }

        }

        System.out.println(longWord + " is longest word with " + longWord.length() + " characters");
    }
    public static void top5Words(String text) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<String> arrayList = new ArrayList(Arrays.asList(text.toLowerCase().split("[,.!?;[0-9]\\s]+")));
        for (int i = 1; i <= 5; i++) {
            int maxValue = 0;

            for (String word : arrayList) {
                Integer number = map.get(word);
                if (number == null) number = 1;
                else number = ++number;
                map.put(word, number);
            }

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                int value = entry.getValue();
                if (value > maxValue) {
                    maxValue = value;
                }
            }
            String key = getKeyFromValue(map, maxValue);
            System.out.println(" Top " + i + " = " + key);
            map.remove(key);
            arrayList.removeAll(Collections.singleton(key));
        }
    }

    public static String getKeyFromValue (Map < String, Integer > hashMap, Integer value){
        for (String word : hashMap.keySet()) {
            if (hashMap.get(word).equals(value)) {
                return word;
            }
        }
        return null;
    }

}



