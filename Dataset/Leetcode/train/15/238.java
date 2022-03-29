 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        Arrays.sort(nums); 
        return nSumTarget(nums, 3, 0, 0);
    }
    public List<List<Integer>> nSumTarget( int[] nums, int n, int start, int target) {
        
        int sz = nums.length;
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        // 至少是 2Sum，且数组大小不应该小于 n
        if (n < 2 || sz < n) return res;
        // 2Sum 是 base case
        if (n == 2) {
            // 双指针那一套操作
            int lo = start, hi = sz - 1;
            while (lo < hi) {
                int sum = nums[lo] + nums[hi];
                int left = nums[lo], right = nums[hi];
                if (sum < target) {
                    while (lo < hi && nums[lo] == left) lo++;
                } else if (sum > target) {
                    while (lo < hi && nums[hi] == right) hi--;
                } else {
                    res.add(Arrays.asList(nums[lo], nums[hi]));
                    while (lo < hi && nums[lo] == left) lo++;
                    while (lo < hi && nums[hi] == right) hi--;
                }
            }
        } else {
            // n > 2 时，递归计算 (n-1)Sum 的结果
            for (int i = start; i < sz; i++) {
                List<List<Integer>> 
                    sub = nSumTarget(nums, n - 1, i + 1, target - nums[i]);
                for (List<Integer> arr : sub) {
                    // (n-1)Sum 加上 nums[i] 就是 nSum
                    List arr1 = new ArrayList(arr);
                    arr1.add(nums[i]);
                    res.add(arr1);
                }
                //第一个数不能重复
                while (i < sz - 1 && nums[i] == nums[i + 1]) i++;
            }
        }
        return res;
    }

}

