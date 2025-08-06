class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String words [] = s.split(" ");
        String lastindex = words[words.length-1];
        return lastindex.length();
    }
}