    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        backtrack(lists, nums, new ArrayList<>(), 0);

        return lists;
    }

    public void backtrack(List<List<Integer>> lists, int[] nums, List<Integer> list, int t) {
        if (t == nums.length) lists.add(new ArrayList<>(list));
        else {
            for (int i = 0; i < nums.length; i++) {
                if (!list.contains(nums[i])) {
                    list.add(nums[i]);
                    backtrack(lists, nums, list, t + 1);
                    list.remove(Integer.valueOf(nums[i]));
                }
            }
        }
    }

