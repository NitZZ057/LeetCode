class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        int start = newInterval[0];
        int end = newInterval[1];

        for(int[] interval: intervals){
            if(interval[1] < start){
                result.add(interval);
            }else if(end < interval[0]){
                result.add(new int[]{start, end});
                start = interval[0];
                end = interval[1];
            }else{
                start = Math.min(start, interval[0]);
                end = Math.max(end, interval[1]);
            }
        }

        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
    }
}