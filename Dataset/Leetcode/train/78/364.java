    public List<List<Integer>> XXX(int[] nums) {
        int n = nums.length;
        int max = (int) Math.pow(2, n);
        List<List<Integer>> lists = new ArrayList<>(n);
        lists.add(new ArrayList<>());
        for (int i = 1; i <= max; i++) {
            List<Integer> sub = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) sub.add(nums[j]);
            }
            if (!sub.isEmpty()) lists.add(sub);
        }
        return lists;
    }

