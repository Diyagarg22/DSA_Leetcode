class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet <>();
        Set<Integer> s2=new HashSet <>();
        for(int ele:nums1){
            s1.add(ele);
        }
        for(int ele:nums2){
            s2.add(ele);
        }

        int[] result=new int[s1.size()];
        int k=0;
        for(int ele:s1){
            if(s2.contains(ele)){
                result[k]=ele;
                k+=1;
            }
        }

       return Arrays.copyOfRange(result,0,k);
        
    }
}