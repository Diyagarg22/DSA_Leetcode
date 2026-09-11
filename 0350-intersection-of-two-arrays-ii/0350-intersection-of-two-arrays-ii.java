class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap <>();
        for(int ele:nums1){
            map.put(ele,map.getOrDefault(ele,0) +1);
        }
        int[] res=new int[nums1.length];
        int k=0;
        for(int ele:nums2){
            int count=map.getOrDefault(ele,0);
            if(count==0) continue;
            else{
                res[k]=ele;
                k+=1;
                map.put(ele,count-1);
            }
        }

        return Arrays.copyOfRange(res,0,k);
    }
}