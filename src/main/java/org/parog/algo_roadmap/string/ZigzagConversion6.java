package org.parog.algo_roadmap.string;

/**
 * 1.
 * 1 <= s.length <= 1000
 * s состоит из английских букв (строчных и прописных), ',' и '.'.
 * 1 <= numRows <= 1000
 * 2.
 * Тестовый класс {@link ZigzagConversion6Test}
 * 3.
 * В основном асимптотика алгоритмов одинаковы:
 * Временная сложность: O(n), где n - длина входной строки.
 * Пространственная сложность: O(n) для хранения результирующей строки.
 * <p>
 * Однако алгоритм convert будет проседать по памяти, так как в худшем случае (когда numRows близок к n), этот метод может
 * использовать больше памяти, так как создает numRows объектов StringBuilder
 */
public class ZigzagConversion6 {
    /**
     * Преобразует строку s в зигзагообразный паттерн с заданным количеством строк numRows.
     * <p>
     * Временная сложность: O(n)
     * Пространственная сложность: O(n)
     *
     * @param s       Входная строка.
     * @param numRows Количество строк в зигзагообразном паттерне.
     * @return Преобразованная строка.
     */
    public static String convert(String s, int numRows) {
        // Если zigzag невозможен (одна строка или строк больше, чем символов),
        // возвращаем исходную строку
        if (numRows == 1 || s.length() < numRows) {
            return s;
        }

        StringBuilder[] builders = new StringBuilder[numRows];
        // Текущая строка и направление движения (вниз или вверх)
        int row = 0, direction = 0;

        for (int i = 0; i < builders.length; i++) {
            builders[i] = new StringBuilder();
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            row += direction;
            builders[row].append(c);

            // Меняем направление, если достигли верхней или нижней строки
            if (row == 0 || row == numRows - 1) {
                direction = (direction == 0) ? 1 : -direction;
            }
        }
        return printResult(builders);
    }

    /**
     * Альтернативная версия convert, использующая один StringBuilder и прямой расчет индексов.
     * <p>
     * Временная сложность: O(n)
     * Пространственная сложность: O(n)
     *
     * @param s       Входная строка.
     * @param numRows Количество строк в зигзагообразном паттерне.
     * @return Преобразованная строка.
     */
    public static String convertV2(String s, int numRows) {
        // Если zigzag невозможен (одна строка или строк больше, чем символов),
        // возвращаем исходную строку
        if (numRows == 1 || s.length() < numRows) {
            return s;
        }

        StringBuilder answer = new StringBuilder();
        // Расстояние между символами в строке
        int diff = 2 * (numRows - 1);
        // Расстояние между диагональными символами
        int diagonalDiff = diff;
        // Индекс диагонального символа
        int diagonalIndex;
        // Индекс текущего символа
        int curIndex;

        // Цикл по строкам зигзага
        for (int i = 0; i < numRows; i++) {
            curIndex = i;
            while (curIndex < s.length()) {
                // Добавляем символ в строке
                answer.append(s.charAt(curIndex));

                // Если не первая и не последняя строка, добавляем диагональный символ
                if (i != 0 && i != numRows - 1) {
                    diagonalDiff = diff - 2 * i;
                    diagonalIndex = curIndex + diagonalDiff;
                    if (diagonalIndex < s.length()) {
                        answer.append(s.charAt(diagonalIndex));
                    }
                }
                curIndex += diff; // Переходим к следующему символу в строке
            }
        }
        return answer.toString();
    }

    /**
     * Объединяет строки из массива StringBuilder в одну результирующую строку.
     *
     * @param builders Массив StringBuilder, содержащий строки зигзага.
     * @return Результирующая строка.
     */
    private static String printResult(StringBuilder[] builders) {
        StringBuilder result = new StringBuilder();

        for (StringBuilder sb : builders) {
            result.append(sb.toString());
        }
        return result.toString();
    }
}
