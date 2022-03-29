 class Solution {
    public int[] XXX(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> integerMap = new HashMap<>(n);        
        for (int i = 0; i < n; i++) {
          int temp = nums[i];
          if (integerMap.containsKey(temp)) {
            return new int[] {integerMap.get(temp), i};
          }
          integerMap.put(target - temp, i);
        }
        return null;
    }         
}

