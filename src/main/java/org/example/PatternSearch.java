package org.example;

import java.util.ArrayList;
import java.util.List;

public class PatternSearch {
    public static List<Integer> search(String S, String pat) {
        List<Integer> result = new ArrayList<>();
        int N = S.length();
        int M = pat.length();

        // Traverse through the text string
        for (int i = 0; i <= N - M; i++) {
            // Check if the current substring matches the pattern
            int j;
            for (j = 0; j < M; j++) {
                if (S.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
            // If pat[0...M-1] matches S[i, i+1, ...i+M-1], then add the index to the result
            if (j == M) {
                result.add(i + 1); // 1-based index
            }
        }

        return result;
    }
}

