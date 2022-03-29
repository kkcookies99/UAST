 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        //排序
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int one = nums[i];
                int two = nums[j];
                int three = -one - two;
                if (set.contains(three)) {
                    List<Integer> list = Arrays.asList(one, two, three);
                    result.add(list);
                }
            }
            set.add(nums[i]);
        }
        return new ArrayList<>(result);

    }
}

