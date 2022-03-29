 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length<3||nums==null)return res;
        Arrays.sort(nums);
        for(int i = 0;i < nums.length - 2 ;i ++){
            if(nums[i]>0)return res;
            if(i!=0&&nums[i]==nums[i-1])continue;
            for(int j = i + 1,k = nums.length - 1;j < k; j ++){
                if(j > i + 1 &&nums[j] == nums[j-1])continue;
                while(j < k - 1 && nums[i] + nums[j] + nums[k] > 0 )k--;
                if(nums[i] + nums[j] + nums[k] == 0){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                }
            }
        }
        return res;
    }
}

