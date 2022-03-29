 class Solution {
    public int XXX(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int length = nums.length;
        int sum = 0;
        int max = nums[0];
        int start = 0;
        for (int end = 0; end < length; end++) {
            for (; start <= end; ) {
                //序列中新加一个元素后的和
                sum += nums[end];
                max = Math.max(max,sum);
                // 该序列和大于0  则追加元素
                if(sum > 0){
                    break;
                }else {
                    //否则前面序列抛弃，重新查找后面序列中的子序列的和
                    start = end+1 ;
                    sum = 0;
                }
            }
        }
        return max;
    }
}

