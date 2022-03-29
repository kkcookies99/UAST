 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (nums.length < 3) {
            return list;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while(left < right) {
                if (left > i + 1 && nums[left] == nums[left - 1]) {
                    left ++;
                    continue;
                }
                // if (right < nums.length - 1 && nums[right] == nums[right + 1]) {
                //     right --;
                //     continue;
                // }
                if (nums[i] + nums[left] + nums[right] == 0) {
                    List<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(nums[i]);
                    tmp.add(nums[left]);
                    tmp.add(nums[right]);
                    list.add(tmp);
                    left ++;
                    right --;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left ++;
                } else if (nums[i] + nums[left] + nums[right] > 0) {
                    right --;
                }
            }
        }
        return list;
    }
}

