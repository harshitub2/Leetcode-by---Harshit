class Solution {
    public String decodeAtIndex(String s, int k) {
        long size = 0;
        
        // Calculate the total size of the decoded string
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                size *= (c - '0'); // Multiply size by the digit
            } else {
                size++;
            }
        }
        
        // Traverse the string in reverse to find the k-th character
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                size /= (c - '0'); // Divide size by the digit
                k %= size; // Reduce k modulo size
            } else {
                if (k == 0 || k == size) {
                    return String.valueOf(c);
                }
                size--;
            }
        }
        
        return null; // This should not happen if k is valid
    }
}