 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums.length < 3){
            return result;
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int target = -nums[i];
            int start = i+1;
            int end = nums.length - 1;
            while(start < end){
                if(nums[start]+nums[end]==target){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[start]);
                    list.add(nums[end]);
                    list.add(-target);
                    result.add(list);
                    start += 1;
                    end -= 1;
                    while (nums[start-1] == nums[start] && start < end) {
                        start += 1;
                    }
                    while (nums[end+1] == nums[end] && start < end) {
                        end -= 1;
                    }
                }else if(nums[start] + nums[end] < target){
                    start += 1;
                    // while (nums[start-1] == nums[start] && start < end) {
                    //     start += 1;
                    // }
                }else{
                    end -= 1;
                    // while (nums[end+1] == nums[end] && start < end) {
                    //     end -= 1;
                    // }
                }
            }
        }
        return result;
    }
}

