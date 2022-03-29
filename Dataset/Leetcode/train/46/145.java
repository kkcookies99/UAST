class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        boolean[] hasSearch = new boolean[nums.length];
        int[] tmpResult = new int[nums.length];
        Arrays.fill(tmpResult, Integer.MIN_VALUE);
        List<List<Integer>> results = new LinkedList<>();
        search(nums, hasSearch, results, tmpResult, 0);
        return results;
    }

    private void search(int[] nums, boolean[] hasSearch, List<List<Integer>> results, int[] tmpResult, int count) {
        if (count == nums.length) {
            List<Integer> result = new LinkedList<>();
            for (int num : tmpResult) {
                result.add(num);
            }
            results.add(result);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!hasSearch[i]) {
                hasSearch[i] = true;
                tmpResult[count] = nums[i];
                search(nums, hasSearch, results, tmpResult, count + 1);
                tmpResult[count] = Integer.MIN_VALUE;
                hasSearch[i] = false;
            }
        }
    }
}

