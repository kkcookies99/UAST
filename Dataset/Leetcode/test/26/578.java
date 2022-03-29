 class Solution {
    public int XXX(int[] nums) {
         int length = nums.length;
        int i=0; 
        int j=1;
        //first 第一个不重复的数的位置
        int first=0;
        int l=1;
        for(;i<length;i++){
            //i==length-1时,j=i+1会越界
            if(i==length-1){
                j=i;
            }else {
                j=i+1;
            }
            //找到不重复的数，并将它放到前一个不重复的数后面一个
            if(nums[i] != nums[first]){
                nums[first+1]=nums[i];
                first++;
                l++;
            }
            //直接跳过i+1
            if(nums[i]==nums[j]){
                i=j;
            }
        }
        return l;

    }
}
