Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0]; // new instance of String which will start at the first letter 
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // while the index of i is not at the prefix
                prefix = prefix.substring(0, prefix.length() - 1); // shorten the word
            }
        }
        return prefix;
    }
}

prefix = ["flower"; "flow"; "flight"]; // if we're starting at flower, the word will slowly become shorter until a prefix is found. 

// for example flower become flowe, then flow, which is a match for the second word but not the third. Therefore, "fl" would be the common prefix. 
