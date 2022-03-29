 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<List<Integer>>();
        }
        Arrays.sort(nums);
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0;i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            if (nums[i] > 0) {
                break;
            }
            if (i < nums.length - 2){
                int left = i+1;
                int right = nums.length-1;
                while (left < right) {
                    int sum = nums[left] + nums[right] + nums[i];
                    if (sum == 0) {
                        ArrayList tmp = new ArrayList();
                        tmp.add(nums[left]);
                        tmp.add(nums[right]);
                        tmp.add(nums[i]);
                        res.add(tmp);
                        left++;
                        right--;
                        while (nums[left] == nums[left-1] && left < right) {
                            left++;
                        }
                        while (nums[right] == nums[right+1] && left < right) {
                            right--;
                        }
                    } else if (sum < 0) {
                        left++;
                        //不知道为什么加了这几行变慢
//                        while (nums[left-1] == nums[left] && left < right) {
//                            left++;
//                        }
                    } else if (sum > 0) {
                        right--;
                        //同上
//                        while (nums[right+1] == nums[right] && left < right) {
//                            right--;
//                        }
                    }
                }
            }
        }
        return res;
    }
}

