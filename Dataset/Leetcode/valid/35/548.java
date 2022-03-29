 class Solution {
    public int XXX(int[] nums, int target) {
       int index=0;
        int noIndex=0;
        for(int num : nums){
            if(num==target){
                break;
            }
            index++;
            if(num<=target){
                noIndex=index;
            }
        }
        return index==nums.length?noIndex:index;
    }
}

