 class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    boolean[] used;

    public List<List<Integer>> XXX(int[] nums) {
        Arrays.sort(nums);
        used = new boolean[nums.length];
        List<Integer> list = new ArrayList<>();
        backtrack(nums, 0, 0, list);
        return res;
    }

    public void backtrack(int[] nums, int target, int start, List<Integer> list) {
        if (list.size() == 3 && target == 0 && !res.contains(list)) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (!used[i]) {
                if (list.size() >= 3) return;
                if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;

                target += nums[i];
                list.add(nums[i]);
                used[i] = true;
                backtrack(nums, target, i + 1, list);
                list.remove(list.size() - 1);
                target -= nums[i];
                used[i] = false;
            }
        }
    }
}

