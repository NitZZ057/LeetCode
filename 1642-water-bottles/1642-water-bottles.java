class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;

        while(numExchange <= numBottles){
            ans = ans + numBottles/numExchange;

            numBottles = (numBottles/numExchange) + (numBottles%numExchange);
        }

        return ans;
    }
}