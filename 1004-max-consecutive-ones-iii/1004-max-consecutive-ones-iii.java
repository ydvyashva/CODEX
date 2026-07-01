class Solution {
    public int longestOnes(int[] nums, int k) {
        int s1=0;
        int e1=0;
        int count=0;
        int size=0;
        int ans=0;
        while(e1<nums.length){
            if(nums[e1]==0){
                count++;
            }
            while(count>k){
                if(nums[s1]==0){
                    count--;
                }
                s1++;
            }
            ans=Math.max(ans,(e1-s1+1));
            e1++;
        }
        return ans;
        
    }
}