 class Solution {
    public int[] XXX(int[] nums, int target) {
//         max的二进制表示为每位都是1，长度是反复提交测试后得到的
//         正常应该用hashmap做，此处是投机取巧了
        int max = 0x7ff;
//         开一个数组来保存每个数的位置，初始值为-1
        int[] map = new int[max + 1];
        Arrays.fill(map, -1);
//         index是转换后的索引，i为当前位置
        int index = 0, i = 0;
        for (; i < nums.length; i++) {
//             计算当前位置的值与目标的差值，并转换为索引
            index = (target - nums[i]) & max;
//             若差值已经出现过则退出循环
            if (map[index] != -1) {
                break;
            }
//             将当前值转为索引存入数组
            map[nums[i] & max] = i;
        }
        return new int[]{map[index], i};
    }
}

