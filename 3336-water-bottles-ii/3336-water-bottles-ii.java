class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int full = numBottles;
        int drunk = 0;
        int empty = 0;
        
        while(true){
            drunk += full;
            empty += full;
            full = 0;

            if(empty < numExchange){
                break;
            }
            empty -= numExchange;
            numExchange++;
            full += 1;
        }

        return drunk;

    }
}