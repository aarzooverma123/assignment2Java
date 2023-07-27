package com.example.srabblepointsgenerator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class game {
    static HashMap<Character, Integer> letterValues = new HashMap<>();
    static ArrayList<String> previousWords = new ArrayList<>();

    public static void main(String[] args) {
        initializeLetterValues();
        Scanner scanner = new Scanner(System.in);

        int totalPointsEarned = 0;
        int aCount = 9;
        int bCount = 2;
        int cCount = 2;
        int dCount = 4;
        int eCount = 12;
        int fCount = 2;
        int gCount = 3;
        int hCount = 2;
        int iCount = 9;
        int jCount = 1;
        int kCount = 1;
        int lCount = 4;
        int mCount = 2;
        int nCount = 6;
        int oCount = 8;
        int pCount = 2;
        int qCount = 1;
        int rCount = 6;
        int sCount = 4;
        int tCount = 6;
        int uCount = 4;
        int vCount = 2;
        int wCount = 2;
        int xCount = 1;
        int yCount = 2;
        int zCount = 1;
// enter word
        while (true) {
            System.out.println("Enter word here:");
            String word = scanner.nextLine().toUpperCase();
            //error message for min. limit
            if (word.length() < 2) {
                System.out.println("min. word length is two");
                continue;
            }
            //setting limit atleast one vowel
            boolean hasVowel = false;
            for (char c : word.toCharArray()) {
                if (isVowel(c)) {
                    hasVowel = true;
                    break;
                }
            }
            if (!hasVowel) {
                System.out.println("Word must have atleast one vowel.");
                continue;
            }
            //setting word limit 8
            if (word.length() > 8) {
                System.out.println("Word limit is 8 characters");
                continue;
            }
            //restricting repitition
            if (previousWords.contains(word)) {
                System.out.println("Word cannot be repeated.");
                continue;
            }


            previousWords.add(word);
            totalPointsEarned += calculatePoints(word);
            System.out.println("Points earned  for \"" + word + "\": " + calculatePoints(word));
            System.out.println("Total points earned: " + totalPointsEarned);
            System.out.println("Previous words used: " + previousWords.toString());
        }

    }

    private static boolean isVowel(char c) {
        if(isVowel(c)){
            return true;
        }
        else {
            return false;
        }
    }
// calculating total points
    private static int calculatePoints(String word) {
        int score = 0;
        for (int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);

        }
        return score++;
    }

    public static void initializeLetterValues() {
        letterValues.put('A', 1);
        letterValues.put('B', 3);
        letterValues.put('C', 3);
        letterValues.put('D', 2);
        letterValues.put('E', 1);
        letterValues.put('F', 4);
        letterValues.put('G', 2);
        letterValues.put('H', 4);
        letterValues.put('I', 1);
        letterValues.put('J', 8);
        letterValues.put('K', 5);
        letterValues.put('L', 1);
        letterValues.put('M', 3);
        letterValues.put('N', 1);
        letterValues.put('O', 1);
        letterValues.put('P', 3);
        letterValues.put('Q', 10);
        letterValues.put('R', 1);
        letterValues.put('S', 1);
        letterValues.put('T', 1);
        letterValues.put('U', 1);
        letterValues.put('V', 4);
        letterValues.put('W', 4);
        letterValues.put('X', 8);
        letterValues.put('Y', 4);
        letterValues.put('Z', 10);


    }


}
