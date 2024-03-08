package org.parog;

public class RomanToInteger13 {
    public int romanToInt(String s) {
        if ("".equals(s)) {
            return 0;
        }

        int countResult = 0;
        char[] arrayChars = s.toCharArray();
        for (int i = 0; i < arrayChars.length - 1; i++) {
            int current = convertRomanToInteger(arrayChars[i]);
            int next = convertRomanToInteger(arrayChars[i + 1]);
            if (current < next) {
                countResult -= current;
            } else {
                countResult += current;
            }
        }
        countResult += convertRomanToInteger(arrayChars[arrayChars.length - 1]);

        return countResult;
    }


    public static int convertRomanToInteger(char roman) {
        return switch (roman) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
