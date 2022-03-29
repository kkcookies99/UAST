 class Solution {
    public int XXX(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int a = 0;
        int l=0;
        int[] numsTemp = new int[nums.length];
        int flag = nums[0];
        int j=0;
        numsTemp[j] = flag;
        for(int i = 1 ; i < nums.length;i++){
            if(nums[i]==flag){
                continue;
            }
            flag = nums[i];
            numsTemp[++j]=flag;
        }
        for(int i = 0 ; i <=j;i++){
            nums[i]=numsTemp[i];
        }
        return ++j;
    }
}

