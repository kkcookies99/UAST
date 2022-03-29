 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length - 2 ; i++){
            if (i != 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                if (nums[left] + nums[right] > target) {
                    right--;
                }else if(nums[left] + nums[right] < target) {
                    left++;
                }else{
                    List<Integer> tempRes = new ArrayList<Integer>();
                    tempRes.add(nums[i]);
                    tempRes.add(nums[left]);
                    tempRes.add(nums[right]);
                    list.add(tempRes);
                    left++;
                    right--;
                    while(nums[left] == nums[left - 1] && left < nums.length - 1){
                        left++;
                    }
                    while(nums[right] == nums[right + 1] && right > 0){
                        right--;
                    }
                }
            }
        }
        return list;
    }
}

