package org.parog.algo_roadmap.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 1.
 * Длина строки: 1 <= moves.length <= 2 * 10^4
 * строка moves содержит символы 'U', 'D', 'L' and 'R'.
 * 2.
 * Тестовый класс {@link RobotReturnToOrigin657Test}
 * 3.
 * Сложность по времени:
 * Сложность по памяти:
 */
public class RobotReturnToOrigin657 {
    public static boolean judgeCircleV1(String moves) {
        if (moves.length() % 2 == 1) {
            return false;
        }
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : moves.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return Objects.equals(charCountMap.get('U'), charCountMap.get('D')) && Objects.equals(charCountMap.get('L'), charCountMap.get('R'));
    }

    public static boolean judgeCircleV2(String moves) {
        if (moves.length() % 2 == 1) {
            return false;
        }

        int x = 0;
        int y = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') {
                y++;
            } else if (c == 'D') {
                y--;
            } else if (c == 'L') {
                x++;
            } else {
                x--;
            }
        }

        return x == 0 && y == 0;
    }
}
