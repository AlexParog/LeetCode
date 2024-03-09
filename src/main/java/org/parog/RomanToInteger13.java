package org.parog;

/**
 * 1.
 * Может ли строка латинских символов содержать еще какие-то символы? нет
 * Какова максимальная длина входящей строки? 15
 * Какое максимальное и минимальное допустимое значение? 3999 и 1
 * <p>
 * 2.
 * 1) "" - пустая
 * 2) "III" - 3
 * 3) "MCMXCIV" - 1994
 * 4) "MMMCMXCIX" - 3999
 * 5) "CDXCIX" - 499
 * 6) "MCMXCIX" - 1999
 * <p>
 * 3.
 * Итерация по строке, где каждый символ конвертируем специальным методом convertRomanToInteger, где внутри используем
 * switch expression. Итерация до предпоследнего элемента. Рассмотрим два случая:
 * 1) Если текущий элемент больше следующего, то складываем;
 * 2) Иначе если текущий элемент меньше, то вычитаем.
 * В конце инкрементируем счетчик последним сконвертированным символом.
 * <p>
 * 4.
 * Время O(n) - итерация по всей строке
 * Память O(n) - храним в массиве символом строку и используем константное кол-во дополнительной памяти
 */
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
