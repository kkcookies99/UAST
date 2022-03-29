class Solution {
    public void XXX(int[] nums) {
        int[] bullket = new int[3];
        for(int i=0;i<nums.length;i++){
            bullket[nums[i]]++;
        }
        int index =0;
        for(int i=0;i<bullket.length;i++){
            for(int j=0;j<bullket[i];j++){
                nums[index++] = i;
            }
        }
    }
}

