class Solution {
    public int distributeCandies(int[] candyType) {
        
        int n = candyType.length;// Total number of candies

        int limit = n/2; //maximum number of candies alice can eat

        int[] uniqueType=new int[n]; //stores different types of candies

        int count=0;

        for(int i=0;i<n;i++){ //this will check each candy

            boolean found = false;

            for(int j=0;j<count;j++){
                if(candyType[i] == uniqueType[j]){ //check previously stored types
                    found= true;
                    break;
                }
            }

            if(!found){
                uniqueType[count] = candyType[i];
                //check each type candy

                count++; //this will increse the number of unique types
            }
        }
        return Math.min(count,limit); 
    }
}