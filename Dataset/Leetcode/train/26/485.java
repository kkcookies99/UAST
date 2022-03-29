    public int XXX(int[] nums) {
          Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], nums[i]);
        }
        int i = 0;
        for (Integer value : map.values()) {
            nums[i] = value;
            i++;
        }
        return map.values().size();
    }
code block

