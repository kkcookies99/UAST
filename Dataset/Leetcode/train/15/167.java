 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        int len = nums.length;
        int len1 = len-1, len2 = len-2;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < len2; i++) {
            for (int j = i+1; j < len1; j++) {
                for (int k = j+1; k < len; k++) {
                    if (nums[i] +nums[j] + nums[k] == 0) {
                        ArrayList<Integer> li = new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[k]));
                        if (!list.contains(li)) {
                            list.add(li);
                        }
                    }
                }
            }
        }
        return list;
    }
}

