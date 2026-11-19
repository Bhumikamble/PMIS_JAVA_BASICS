

class Solution {
    public void duplicateZeros(int[] arr) {

        // Create a new array
        int[] dest = new int[arr.length];

        // Initialize pointers
        int s = 0;
        int d = 0;

        // Traverse original array
        while (s < arr.length) {

            if (arr[s] == 0) {

                // Insert first zero
                if (d < arr.length) {
                    dest[d] = 0;
                }
                d += 1;

                // Insert second zero
                if (d < arr.length) {
                    dest[d] = 0;
                }

            } else {

                // Copy non-zero element
                if (d < arr.length) {
                    dest[d] = arr[s];
                }
            }

            // Move pointers
            d += 1;
            s += 1;
        }

        // Copy result back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = dest[i];
        }
    }
}
