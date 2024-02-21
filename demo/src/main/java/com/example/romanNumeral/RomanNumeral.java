package com.example.romanNumeral;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    private static Map<Character, Integer> map;

    static {
        map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int convert(String s) {
        // char[] subtractors = new char[] {'I', 'X', 'C'};
        String legalSubtractors = "IXC";

        if (maxRepeatLength(s) > 3 && maxRepeatLength(s) !=4) return -1;

        for (char c : s.toCharArray()) {
            if (!map.containsKey(c))  return -1;
        }


        int convertedNumber = 0;
        for(int i = 0; i < s.length(); i++) {
            int currentNumber = 0;
            char currentChar = s.charAt(i);

            currentNumber =  map.get(currentChar);
            int next = i+1 < s.length() ? map.get(s.charAt(i+1)) : 0;

            if(currentNumber >= next)
                convertedNumber += currentNumber;
            else if (legalSubtractors.indexOf(s.charAt(i)) == -1) return -1;
            else if (i > 0 && s.charAt(i) == s.charAt(i-1)) return -1;
            else    convertedNumber -= currentNumber;
        }

        return convertedNumber;

    }



    private static int maxRepeatLength(String str) {
        int len = str.length();
        int count = 0;
        if (len > 0) {

            // Find the maximum length of repeating characters
            for (int i=0; i<len; i++) {
                int current_count = 1;
                for (int j=i+1; j<len; j++) {
                    if (str.charAt(i) != str.charAt(j))
                        break;
                    current_count++;
                }

                // Update result if required
                if (current_count > count) {
                    count = current_count;
                }
            }
        }

        return count;
    }
}
