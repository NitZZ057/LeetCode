class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int count = 0;

        Arrays.sort(points,(a,b) -> {
            if(a[0] == b[0]) return Integer.compare(b[1],a[1]);
            return Integer.compare(a[0],b[0]);
        } );

        for(int A = 0; A < n -1; A++){
            int prevY = Integer.MIN_VALUE;
            for(int B = A + 1; B < n; B++){
                if(points[A][0] <= points[B][0] && points[A][1] >= points[B][1]){
                    if(prevY < points[B][1]){
                        count++;
                        prevY = points[B][1];
                    }
                }
            }
        }

        return count;
    }
}