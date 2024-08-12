package org.example;

public class CountingSort {
    public static String countSort(String arr) {
        int N = arr.length();
        char output[] = new char[N];
        int count[] = new int[26];  // Since we are only dealing with lowercase English letters

        // Store count of each character
        for (int i = 0; i < N; i++) {
            count[arr.charAt(i) - 'a']++;
        }

        // Change count[i] so that count[i] contains the actual position of this character in output[]
        for (int i = 1; i < 26; i++) {
            count[i] += count[i - 1];
        }

        // Build the output character array
        for (int i = N - 1; i >= 0; i--) {
            output[count[arr.charAt(i) - 'a'] - 1] = arr.charAt(i);
            count[arr.charAt(i) - 'a']--;
        }

        // Convert the output array to a string and return it
        return new String(output);
    }
}

