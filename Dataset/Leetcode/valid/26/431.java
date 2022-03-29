 class Solution {
    public int XXX(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
                nums[index++] = num;
            }
        }
        return list.size();
    }
}

