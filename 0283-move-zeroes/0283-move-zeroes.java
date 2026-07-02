class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        while(j<nums.length){
                if(nums[j]!=0){
                    int tem=nums[i];
                    nums[i]=nums[j];
                    nums[j]=tem;
                    i++;
                    j++;
                }
                else{
                    j++;
                }
            }
        }

}