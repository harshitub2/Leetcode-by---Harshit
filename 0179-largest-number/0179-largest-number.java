

class Solution {
    public String largestNumber(int[] nums) {
        // Convert the integers to strings
        String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = String.valueOf(nums[i]);
        }

        // Sort the array with a custom comparator that compares concatenated results
        Arrays.sort(numStrs, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                // We need to sort in descending order, so reverse the comparison
                return order2.compareTo(order1);
            }
        });

        // If the largest number is '0', the result should be '0'
        if (numStrs[0].equals("0")) {
            return "0";
        }

        // Build the largest number from the sorted array
        StringBuilder largestNumber = new StringBuilder();
        for (String numStr : numStrs) {
            largestNumber.append(numStr);
        }

        return largestNumber.toString();
    }
}
