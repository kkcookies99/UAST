 public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        HashMap<Integer, Integer> tmp = new HashMap<>();
        for (int num : nums) {
            if (tmp.get(num) == null) {
                tmp.put(num, 1);
            } else {
                int count = tmp.get(num);
                tmp.put(num, count + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : tmp.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }

