class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int newtarget = target - nums[i];
            for(int j = i+1; j < nums.length; j++) {
                if(newtarget == nums[j]){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
