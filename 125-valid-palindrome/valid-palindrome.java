class Solution {
    public boolean isPalindrome(String s) {
        String c = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(c.isEmpty()){
            return true;
        }
        int start = 0;
        int end = c.length()-1;

        while(start<end){
            if(c.charAt(start) != c.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}