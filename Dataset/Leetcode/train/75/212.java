class Solution {
    public void XXX(int[] nums) {
        //计数排序
        int[] sort=new int[3];

        for(int i=0;i<nums.length;i++){
            sort[nums[i]]++;
        }
        int j=0;
        for(int i=0;i<3;i++){
            while(sort[i]!=0){
                nums[j++]=i;
                sort[i]--;
            }
        }
        
    }
}

