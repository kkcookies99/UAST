     public int XXX(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int n = set.size();
        List<Integer> integers = new ArrayList<>();
        integers.addAll(set);
        Collections.sort(integers);
        
        for (int i = 0; i < n; i++) {
            nums[i] = integers.get(i);
        }
        return n;
    }```
先去重再排序，最后一个个写进去


