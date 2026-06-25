class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        revrse(nums,0,n-1);
        revrse(nums,0,k-1);
        revrse(nums,k,n-1);
        
    }
    public void revrse(int[] nums, int low,int high){
        while(low<=high){
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
    }
}