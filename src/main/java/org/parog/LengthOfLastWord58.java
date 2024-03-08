package org.parog;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
