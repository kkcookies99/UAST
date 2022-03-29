 class Solution {
    // 应该会有更好的解法, 这个是我第一次想出来的解法
    // 1ms、99.86%
    public int XXX(int[] nums) {

        // 这个长度是用于返回值的
        int length = nums.length;
        // 每次发现的重复元素数量
        int count = 0;
        // 遍历到不同的元素的时候, 元素存放的位置
        int index = 0;
        /*
         1. 这里使用的长度不能够是 length, 因为 length 会发生变化
         2. 不要使用 i++, 会重复计算
         */
        for(int i = 0;i < nums.length;i = i + count + 1){
            count = 0;
            for(int j = i + 1;j < nums.length;j++){
                if(nums[i] == nums[j])
                    // 只要发现相等的元素就会触发计数器+1
                    count++;
                else{
                    // 每次发现不同的元素, 都需要将元素移动到前面去
                    nums[++index] = nums[j];
                    // 记得跳出循环
                    break;
                }
            }
            // 长度减少
            length -= count;
        }

        return length;
    }
}

