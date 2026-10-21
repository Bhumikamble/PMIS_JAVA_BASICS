
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int sumA = 0; // Stores Alice's total number of candies
        int sumB = 0; // Stores Bob's total number of candies

        // Calculate the total candies Alice has
        for (int a : aliceSizes) {
            sumA += a; // Add the current box size to Alice's total
        }

        // Calculate the total candies Bob has
        for (int b : bobSizes) {
            sumB += b; // Add the current box size to Bob's total
        }

        // Calculate the difference Bob needs to gain from the exchange
        int diff = (sumB - sumA) / 2;

        // Check each box Alice has
        for (int a : aliceSizes) {

            // Check each box Bob has
            for (int b : bobSizes) {

                // Check whether Bob's box has the required difference
                if (b - a == diff) {

                    // Return Alice's box size first, then Bob's box size
                    return new int[]{a, b};
                }
            }
        }

        // Required fallback return statement
        return new int[]{};
    }
}
