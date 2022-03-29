 class Solution {
    public int XXX(int[] nums, int target) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            temp.add(nums[i]);
        }
        temp.add(target);
        temp.sort(Comparator.naturalOrder());
        return temp.indexOf(target);
    }
}

