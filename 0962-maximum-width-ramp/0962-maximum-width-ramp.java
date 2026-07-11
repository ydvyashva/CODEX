class Solution {
    public int maxWidthRamp(int[] nums) {
        int n=nums.length;
        int right[]= new int[n];
        right[n-1]= nums[n-1];

        for(int i=n-2; i>=0;i--){
            right[i]=Math.max(nums[i],right[i+1]);
                
        }
        int i=0;
        int j=1;
        int ans=0;
        while(j<n){
            if(nums[i]<=right[j]){
                ans=Math.max(ans,j-i);
                j++;
            }
            else{
                i++;
            }
        }
        return ans;
        
    }
}