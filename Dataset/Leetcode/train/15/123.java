 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        boolean flag = false;
        int length = nums.length, before1 = 0, before2 = 0;
        Arrays.sort(nums); 
        for (int i = 0; i < length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) 
                continue;
            
            int left = i + 1;
            int right = length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    if (flag && before1 == nums[left] && before2 == nums[right])  {
                        left++;
                        continue;
                    }
                        
                    result.add(Arrays.asList(nums[i],nums[left], nums[right]));
                    left++;
                    before1 = nums[left];
                    before2 = nums[right];
                    flag = true;
                }       
            }
        }
        return result;
    }
}

