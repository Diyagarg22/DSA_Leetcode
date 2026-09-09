class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int ele:nums){
            ans=ans^ele;
        }
        return ans ;
    }
}