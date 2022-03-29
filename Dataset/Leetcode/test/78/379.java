    public List<List<Integer>> XXX(int[] nums) {
        int length = nums.length;
        List<List<Integer>> all = new ArrayList<>(2 << length);
        all.add(new ArrayList<>(0));
        for (int num : nums) {
            int size = all.size();
            for (int i = 0; i < size; i++) {
                List<Integer> item = all.get(i);
                List<Integer> list = new ArrayList<>(item.size());
                list.addAll(item);
                list.add(num);
                all.add(list);
            }
        }
        return all;
    }

