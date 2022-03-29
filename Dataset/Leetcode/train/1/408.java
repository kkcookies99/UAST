 public int[] XXX(int[] nums, int target) {
    int[] result = new int[]{-1,-1};
    Map<Integer, Integer> map = new HashMap<>();

    for(int i = 0; i < nums.length; i++) {
        Integer temp = target - nums[i];
        if(map.containsKey(temp)) {
            result[0] = map.get(temp).intValue();
            result[1] = i;
            break;
        }
        map.put(nums[i], i);
    }
    return result;
}

