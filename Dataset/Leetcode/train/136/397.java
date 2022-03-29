 class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> h=new HashSet();
        for(int i=0;i<nums.length;i++){
            if(!h.add(nums[i])){
                h.remove(nums[i]);
            }
        }
        for(Integer i:h){
            return i;
        }
        return 0;
    }
}

