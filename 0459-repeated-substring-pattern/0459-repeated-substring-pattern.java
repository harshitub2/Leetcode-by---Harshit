class Solution {
    public boolean repeatedSubstringPattern(String s) {
       String wrd= s+s;
        return wrd.substring(1,wrd.length()-1).contains(s);
    }
}