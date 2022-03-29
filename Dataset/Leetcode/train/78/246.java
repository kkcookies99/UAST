class Solution {
    public static List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        for (int i = 0; i <= nums.length; i++) {
            dsf(ans, new LinkedList<>(), i, nums, 0);
        }
        return ans;
    }
    private static void dsf(List<List<Integer>> ans, LinkedList<Integer> item, int count, int[] nums,int index) {
        if (item.size() == count){
            ans.add(new ArrayList<>(item));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            item.add(nums[i]);
            dsf(ans, item, count, nums, i + 1);
            item.removeLast();
        }
        
    }
}

