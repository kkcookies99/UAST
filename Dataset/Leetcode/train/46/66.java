class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {
        int n = nums.length;
        dfs(nums, 0, n - 1);
        return ans;
    }

    public void dfs(int[] nums, int begin, int end) {
        if (begin == end) {
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                arr.add(nums[i]);
            }
            ans.add(arr);
        } else {
            for(int j=begin; j<=end; j++) {
                Swap(nums, j, begin); //每个元素和第一个元素交换 
                dfs(nums, begin+1, end); //对子序列继续递归调用
                Swap(nums, j, begin); //恢复原始的list，不影响下次递归调用。
            } 
        }
    }

    public void Swap(int[] nums, int i, int j) {
	    int value = nums[i];
	    nums[i] = nums[j];
	    nums[j] = value;
    }
}

