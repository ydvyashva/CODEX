class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer>map=new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int count=map.get(nums[i]);
                map.put(nums[i],count+1);
            }
            else{
                map.put(nums[i],1);
            }

        }
        for(int ele:map.keySet()){
            if(map.get(ele)>nums.length/2){
                return ele;
            }
        }
        return -1;
        }
        
    }
