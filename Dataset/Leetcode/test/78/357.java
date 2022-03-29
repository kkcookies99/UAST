public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> nullSet = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        res.add(nullSet);
        for (int i = 0; i < nums.length; i++) {
            int size = res.size();
            for (int j = 0; j < size; j++) {
                // 获取res中的集合，加入新元素，构成新集合
                List<Integer> list = new ArrayList<>(res.get(j));
                list.add(nums[i]);
                res.add(list);
            }
        }
        return res;
    }

