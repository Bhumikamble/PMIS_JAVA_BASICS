class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n=nums.length;

        int[] result=new int[n];
        
        int i=0;

        for(int num:nums){

            result[i]=num*num;

            i++;
        }

         Arrays.sort(result);

         return result;
    }
}