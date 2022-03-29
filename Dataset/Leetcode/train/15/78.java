 class Solution {
    public static List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        Arrays.sort(nums);                                  // 先排序  o(nlogn)
        int len = nums.length;
        if(nums == null || len < 3) return list;    // 完备性
        for (int i = 0; i < len ; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;    // 一次去重优化
            int L = i+1;
            int R = len-1;
            while(L<R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0){
                    list.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R && nums[L] == nums[L+1]) L++;               //###二次去重优化
                    while (L<R && nums[R] == nums[R-1]) R--;
                    L++;
                    R--;
                }
                else if (sum < 0) L++;
                else R--;
            }
        }        
        return list;
    }
}

