/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
*/

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); // remove trailing spaces from the end of the string
        int lastIndex = s.lastIndexOf(' ') + 1; // finds the index of the last occurance of a space character (' ') in the string
        // lastIndexOf returns the index of the last occurrence of the specified character in the string. By adding 1 to the index, you
        // get the starting index of the last word
        return s.length() - lastIndex; // calculates the length of the last word by subtracting the index of the last space from the total
        // length of the trimmed string. 
    }
}
