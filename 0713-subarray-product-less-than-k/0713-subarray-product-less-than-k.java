class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int s1=0;
        int e1=0;
        int count=0;
        int p=1;
        while(e1<nums.length){
            //growing
            p=p*nums[e1];
            while(p>=k&&s1<=e1){
                p=p/nums[s1];
                s1++;
            }
            count=count+(e1-s1+1);
            e1++;
        
        }
        return count;
        
    }
}