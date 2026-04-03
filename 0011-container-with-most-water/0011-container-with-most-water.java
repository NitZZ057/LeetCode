class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int ans = 0;

        while(left < right){
            ans = Math.max(ans, Math.min(height[left], height[right])*(right-left));
           // System.out.println(ans+" "+height[left]+" "+height[right]);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }

        return ans;
    }
}