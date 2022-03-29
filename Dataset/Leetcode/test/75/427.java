 class Solution {
    public void XXX(int[] nums) {
        //遇见0和前面的交换，遇见1不动
        int zeroPosition = -1;
        int twoposition = nums.length;
        for (int i = 0; i < nums.length; i++) {
            //提高效率，后面都是2了
              if(nums[i] == 2 && i == twoposition - 1){
                break;
            }
            //遇见0和左侧0的下一个位置进行交换
            if (nums[i] == 0) {
                swap(nums, i, ++zeroPosition);
            }
            //右侧元素和当前2交换的时候可能存在副作用，如果遇见0和2和当前的2交换，都需要继续从当前位置开始
            if (nums[i] == 2 && i < twoposition - 1 && nums[twoposition - 1] == 1) {
                swap(nums, i, --twoposition);
            } else if (nums[i] == 2 && i < twoposition - 1) {
                swap(nums, i, --twoposition);
                i--;//注意
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

