class Solution {
    public int numberOfPairs(int[][] points) {
        int count  = 0;
        int n = points.length;

        Arrays.sort(points, (a,b) -> {
            if(a[0] != b[0]) return Integer.compare(a[0],b[0]);
            return Integer.compare(b[1], a[1]);
        });

        for(int A = 0; A < n-1; A++){
            int prevY = Integer.MIN_VALUE;
            for(int B = A+1; B < n; B++){
                if(points[B][1] <= points[A][1] && points[B][1] > prevY){
                    count++;
                    prevY = points[B][1];
                }
            }
        }
        
        return count;
    }
}