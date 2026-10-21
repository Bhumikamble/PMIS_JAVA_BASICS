class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {

        int total = 0;

        for (int i = 0; i < timeSeries.length; i++) {

            if (i == timeSeries.length - 1) {//here timeSeries.length is 4 
                total += duration;  //duration 4
            } 
            else {  //overlapping
                int gap = timeSeries[i + 1] - timeSeries[i];

                if (gap >= duration) {
                    total += duration;
                } else {
                    total += gap;
                }
            }
        }

        return total;
    }
}