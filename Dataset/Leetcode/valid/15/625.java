 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        if(nums.length < 3)
            return result;
        Arrays.sort(nums);
        int target = 0;
        int last = nums.length;
        for(int i = nums[0]; i < last - 2; i++){
            int j = i + 1;
            if(i > nums[0] && nums[i] == nums[i + 1])
                continue;
            int k = last - 1;
            while(j < k){
                if(nums[i] + nums[j] + nums[k] < target){
                    j++;
                    while(nums[j] == nums[j--] && j < k)    
                        j++;
                }else if(nums[i] + nums[j] + nums[k] > target){
                    k--;
                    while(nums[k] == nums[k + 1] && j < k)
                        k--;
                }else{
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(nums[j] == nums[j - 1] && nums[k] == nums[k + 1] && j < k)
                        j++;
                }
            }
        }
        return result;
    }
}

