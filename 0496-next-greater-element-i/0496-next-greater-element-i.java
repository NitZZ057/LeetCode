class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            boolean flag = false;
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    flag = true;
                }
                
                if(flag==true){
                    if(nums2[j]>nums1[i]){
                        ans[i] = nums2[j];
                        break;
                    }else{
                        ans[i] = -1;
                    }
                }
            }
        }

        return ans;
    }
}