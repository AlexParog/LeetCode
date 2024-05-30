package org.parog.algo_roadmap.arrays_hashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings271 {
    public static String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();

        for (String s : strs) {
            builder.append(s.length()).append("#").append(s);
        }

        return builder.toString();
    }

    public static List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1 + length;
            result.add(str.substring(j + 1, i));
        }

        return result;
    }
}
