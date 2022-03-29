 class Solution {
    public int XXX(int[] nums, int target) {
        //先判断数字是否在数组里面
        //如果在数组里面，返回相应的下标
        //如果不在数组里面，将这一个数字按顺序插入到该数组中
        for(int i = 0; i < nums.length; i ++){
            //首先遍历数组
            if(target == nums[i]){//数字如果在数组中，返回其对应的下标
                return i;
            }
            
        }
        //下面的是数字不在数组中的情况，需要比较大小之后在返回其下标
        //按顺序插入到数组中
        for(int i = 0; i < nums.length; i ++){
            if(target <= nums[i]){
                return i;
            }
            
        }
        return nums.length;
       

    }

}```

