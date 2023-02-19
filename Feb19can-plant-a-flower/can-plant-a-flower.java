class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i =0; i < flowerbed.length; i++){
            //Check if the current plot is empty
            if(flowerbed[i] == 0){
                //Check if the right and left plots are empty
                boolean emptyLeftPlot = (i == 0) || (flowerbed[i-1] == 0);
                boolean emptyRightPlot = (i == flowerbed.length -1) || (flowerbed[i+1] == 0);


                //if both plots are empty, we can plant a flower here.
                if(emptyLeftPlot && emptyRightPlot){
                    flowerbed[i] = 1;
                    count++;
                    if(count >= n){
                        return true;
                    }
                }


            }
        }
        return count >= n;
        
    }
}

//https://leetcode.com/problems/can-place-flowers/solutions/127632/can-place-flowers/
