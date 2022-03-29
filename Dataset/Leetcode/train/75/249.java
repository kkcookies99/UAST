class Solution {
    public void XXX(int[] nums) {
        int[] counts = new int[3];
        int i = 0, j = 0;
        for(i = 0; i < nums.length; ++i){
            counts[nums[i]]++;
        }
        i = 0;
        while(i < 3){
            if(counts[i]-- > 0){
                nums[j++] = i;
                continue;
            }
            i++;
        }
    }
}

