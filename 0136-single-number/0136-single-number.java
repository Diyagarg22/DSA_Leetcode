class Solution {
    public int singleNumber(int[] nums) {

       
        HashMap<Integer,Integer> map= new HashMap<>();
            int n=nums.length;
            for(int ele:nums){
                if(!map.containsKey(ele)){
                    map.put(ele,1);
                }
                else{
                    map.put(ele,map.get(ele)+1);
                }
            }
            for(int ele:nums){
                if(map.get(ele)==1){
                    return ele;
                }
            }
        return -1;
    }
}