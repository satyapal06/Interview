package com.interview.general;

import java.util.Arrays;

public class AnagramCheck {
    /** One way to find if two Strings are anagram in Java. This method
     * assumes both arguments are not null and in lowercase.
     * @return true, if both String are anagram
    */
    public static boolean isAnagram(String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }
        char[] chars = word.toCharArray();
        for (char c : chars) {
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1);
            } else {
                return false;
            }
        }
        
        return anagram.isEmpty();
    } 
    
    /** Another way to check if two Strings are anagram or not in Java
     * This method assumes that both word and anagram are not null and lowercase
     * @return true, if both Strings are anagram.
     */
    public static boolean iAnagram(String word, String anagram) {
        char[] charFromWord = word.toCharArray();
        char[] charFromAnagram = anagram.toCharArray();
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);
        return Arrays.equals(charFromWord, charFromAnagram);
    }

    public static boolean checkAnagram(String first, String second) {
        char[] characters = first.toCharArray();
        StringBuilder sbSecond = new StringBuilder(second);
        for (char ch : characters) {
            int index = sbSecond.indexOf("" + ch);
            if (index != -1) {
                sbSecond.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return sbSecond.length() == 0 ? true : false;
    }

    public static void main(String[] args) {
            assert(AnagramCheck.isAnagram("word", "wrdo"));
            assert(AnagramCheck.isAnagram("mary", "army"));
            assert(AnagramCheck.isAnagram("stop", "tops"));
            assert(AnagramCheck.isAnagram("boat", "btoa"));
            assert(AnagramCheck.isAnagram("pure", "in"));
            assert(AnagramCheck.isAnagram("fill", "fil"));
            assert(AnagramCheck.isAnagram("b", "bbb"));
            assert(AnagramCheck.isAnagram("ccc", "ccccccc"));
            assert(AnagramCheck.isAnagram("a", "a"));
            assert(AnagramCheck.isAnagram("sleep", "slep"));
            assert(AnagramCheck.iAnagram("word", "wrdo"));
            assert(AnagramCheck.iAnagram("boat", "btoa"));
            assert(AnagramCheck.iAnagram("pure", "in"));
            assert(AnagramCheck.iAnagram("fill", "fil"));
            assert(AnagramCheck.iAnagram("a", "a"));
            assert(AnagramCheck.iAnagram("b", "bbb"));
            assert(AnagramCheck.iAnagram("ccc", "ccccccc"));
            assert(AnagramCheck.iAnagram("sleep", "slep"));
            assert(AnagramCheck.checkAnagram("word", "wrdo"));
            assert(AnagramCheck.checkAnagram("b", "bbb"));
            assert(AnagramCheck.checkAnagram("ccc", "ccccccc"));
            assert(AnagramCheck.checkAnagram("a", "a"));
            assert(AnagramCheck.checkAnagram("sleep", "slep"));
            assert(AnagramCheck.checkAnagram("boat", "btoa"));
            assert(AnagramCheck.checkAnagram("pure", "in"));
            assert(AnagramCheck.checkAnagram("fill", "fil"));
    }
}
