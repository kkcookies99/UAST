 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        Set result = new HashSet();
        for(int i =0; i < nums.length; i++) {
            for (int j = i +1; j< nums.length; j++) {
                for(int l = j +1; l < nums.length; l++) {
                    if (nums[i] + nums[j]+nums[l] == 0) {
                        List result2 = new ArrayList();
                        result2.add(nums[i]);
                        result2.add(nums[j]);
                        result2.add(nums[l]);
                         Collections.sort(result2);
                        result.add(result2);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}

