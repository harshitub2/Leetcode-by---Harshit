class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        if (n <= 1) {
            return n;
        }

        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        // Forward pass: Give more candies to the right if the ratings increase
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Backward pass: Give more candies to the left if the ratings increase
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }
}
