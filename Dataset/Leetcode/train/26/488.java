 class Solution {
    public int XXX(int[] nums) {

            int temp = 0;//temp指向不同元素的最后一个元素处
            
            for(int i = 0 ; i< nums.length - 1 ; i++){
                if( nums[i] != nums[i+1])
                    nums[++temp] = nums[i+1];
            }
            return ++temp;
    }
}

