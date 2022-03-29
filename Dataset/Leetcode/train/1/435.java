 class Solution {
    int a = 0;          //第一个数
    int b = 0;          //第二个数
    int[] index;        //下表
    public int[] XXX(int[] nums, int target) {
        //遍历数组
        for (int i = 0; i < nums.length; i++) {
            //第一个数放变量i中
            a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                //第二个数放变量j中
                b = nums[j];
                //判定两束相加 余值是否为0
                if ((a + b) % target == 0) {
                    index = new int[]{i, j};
                    //判定结束后将j赋值给i，以防下次遍历出现重复元素
                    i = j;
                }
            }
        }
        return index;
    }
}

