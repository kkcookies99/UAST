class Solution {
    public void XXX(int[] nums) {
        //应该可以使用桶排序
        int[] arr_c=new int[3];
        for(int i=0;i<nums.length;i++){
            arr_c[nums[i]]++;
        }
        int s=0;
        for(int j=0;j<arr_c.length;j++){
            for(int k=0;k<arr_c[j];k++){
                nums[s]=j;
                s++;
            }
            
        }
    }
}

