class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        int total = 1 << nums.length;//子序列的个数
        for (int i = 0; i < total; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if (((1 << j) & i) != 0) {
                    list.add(nums[j]);
                }//不等于0的时候加进去，说明有一个子序列
            }
            lists.add(list);
        }
        return lists;
    }
}

