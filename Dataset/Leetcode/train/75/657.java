 class Solution {
    public void XXX(int[] nums) {
        //利用快排中的三路切分版的思想
        int len = nums.length;
        int zero = -1; // nums[0..zero]存储为0的元素
        int two = len; // nums[two... len - 1]存储为2的元素
        
        for(int i = 0; i < len;) {
            if (i >= two) break;
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 0) {
                int tem = nums[++zero];
                nums[zero] = nums[i];
                nums[i++] = tem;
            } else {
                int temp = nums[--two];
                nums[two] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
