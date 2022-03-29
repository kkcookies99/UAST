class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        // 大小为n的集合子集可用1<<n种二进制数值表示
        for (int i = 0; i < (1 << n); i++) {
	    List<Integer> list = new ArrayList<>();
	    // 表示下标为j的元素是否被选取
            for (int j = 0; j < n; j++) {  
	        if ((i & (1 << j)) != 0) {
		    list.add(nums[j]);
		}
	    }
            res.add(list);
        }
        return res;
    }
}

