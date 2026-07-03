class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean flag = false;
        for(int i=1;i<=nums.length-1;i++){
            if(nums[i-1]==nums[i]){
                flag = true;
                break;
            }
        }
        return flag;
    }
}