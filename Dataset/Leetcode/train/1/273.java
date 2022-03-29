 class Solution {
    public int[] XXX(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, Comparator.comparingInt(Map.Entry::getValue));

        int left = 0;
        int right = nums.length - 1;
        Arrays.sort(nums);
        while (left < right) {
            int sum = entries.get(left).getValue() + entries.get(right).getValue();
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                break;
            }
        }
        return new int[]{entries.get(left).getKey(), entries.get(right).getKey()};
    }
}

