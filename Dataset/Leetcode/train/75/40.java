class Solution {
    public void XXX(int[] nums) {
        //计数排序
        int hash[] = new int[3];
        for(int i : nums) hash[i]++;
        int index=0;
        for(int i=0; i<3; i++){
            for(int j=0; j<hash[i]; j++){
                nums[index++]=i;
            }
        }
    }
}

