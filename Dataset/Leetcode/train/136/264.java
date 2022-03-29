 class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (!list.contains(nums[i])){
                list.add(nums[i]);
            }else {
                list.remove(list.indexOf(nums[i]));
            }
        }
        return list.get(0);
    }
}

