  public int XXX(int[] nums) {
            int len=nums.length;
        if(len<2) return len;          //数组长度小于2，消重后长度和原来都是一样的
        int k=1;       //第一个肯定不同，所以把不同的元素从第二个开始赋.k记录的索引为数组中不重复元素的个数
        for(int i=1;i<len;i++){
            if(nums[i]!=nums[i-1]){
                nums[k++]=nums[i];
            }
        }
        return  k;
    }

