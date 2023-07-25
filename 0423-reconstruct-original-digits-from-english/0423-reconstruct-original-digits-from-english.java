class Solution {
    public String originalDigits(String s) {
        String arr[] = new String[]{"zero","one","two","three","four",
                                    "five","six","seven","eight","nine"};
        int[] store = new int[26];
        for (char ch : s.toCharArray()) {
            store[ch - 'a']++;
        }

        int[] count = new int[10];
        count[0] = store['z' - 'a']; // Count of 'z' in "zero"
        count[2] = store['w' - 'a']; // Count of 'w' in "two"
        count[4] = store['u' - 'a']; // Count of 'u' in "four"
        count[6] = store['x' - 'a']; // Count of 'x' in "six"
        count[8] = store['g' - 'a']; // Count of 'g' in "eight"
        count[1] = store['o' - 'a'] - count[0] - count[2] - count[4]; // Count of 'o' in "one"
        count[3] = store['h' - 'a'] - count[8]; // Count of 'h' in "three"
        count[5] = store['f' - 'a'] - count[4]; // Count of 'f' in "five"
        count[7] = store['s' - 'a'] - count[6]; // Count of 's' in "seven"
        count[9] = store['i' - 'a'] - count[5] - count[6] - count[8]; // Count of 'i' in"nine"

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < count[i]; j++) {
                ans.append(i);
            }
        }

        return ans.toString();
    }
}
