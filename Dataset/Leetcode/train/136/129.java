 public int singleNumber(int[] nums) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for (Integer integer : map.keySet()) {
            if (map.get(integer) == 1) res = integer;
        }
        return res;
    }

