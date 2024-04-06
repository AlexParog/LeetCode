package org.parog.leetcode_programming_skills50;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1.
 * Может ли прийти пустая строка? нет
 * Строка с одним символом допустима? да
 * Какой алфавит используется? english
 * Разделители между словами только пробелы? да
 * <p>
 * 2.
 * 1) "Hello world"
 * 2) "   fly   me   to  the moon"
 * 3) "luffy is still joyboy"
 * 4) "h"
 * 5) "      h       "
 * <p>
 * 3.
 * 1) Используем Regex. regex - \\b\\w+\\b(?!.*\\b\\w+\\b), где
 *  - \\b - граница слова(начало или конец)
 *  - \\w+ - находит один или более буквенно-цифровой символ
 *  - (?!.*\\b\\w+\\b) - не искать последующие слова после найденного
 *      - (?!...) - отрицательное условие, которое говорит что далее в строке должно отсутствовать то, что внутри скобок
 *      - .* - любой символ (кроме перевода строки) любое кол-во раз, включая пробелы
 *      - \\b\\w+\\b - слово, ограниченное одни или более буквенно-цифровым символом
 * 2) Проход по строке, начиная с конца. У нас есть счетчик, который срабатывает на условие: если символ в строке
 * не является пробелом. Иначе смотрим на состояние счетчика: count > 0, тогда мы посчитали последнее слово и это ответ.
 * <p>
 * 4.
 * 1) Время O(n) - поиск по входной строке, где n (количество символом)
 * Память O(1) - регулярка и matcher хранится в памяти, но они не зависят от размера входящей строки, поэтому сложность O(1)
 * 2) Время O(n) - длина строки (n)
 * Память O(1) - используем только счетчик
 */
public class LengthOfLastWord58 {

    public int lengthOfLastWordFirstDecision(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        Pattern pattern = Pattern.compile("\\b\\w+\\b(?!.*\\b\\w+\\b)");
        Matcher matcher = pattern.matcher(s);

        if (matcher.find()) {
            String lastWord = matcher.group();
            return lastWord.length();
        }

        return 0;
    }

    public int lengthOfLastWordSecondDecision(String s) {
        int length = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else {
                if (length > 0) {
                    return length;
                }
            }
        }

        return length;
    }
}
