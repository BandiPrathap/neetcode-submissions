class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int[] res = new int[2];
        while(i<nums.length){
            int next = target-nums[i];
            res[0]=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==next){
                    res[1]=j;
                    return res;
                }
            }
            i++;
        }
        return res;
        
    }
}
