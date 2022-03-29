 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;
        for(int i = 0;i < length-2;i++){
            //除重操作
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int l = i+1,k = length-1;
            while(l < k){
                if(nums[l] + nums[k] == -nums[i]){
                    res.add(Arrays.asList(nums[i],nums[l],nums[k]));
                    while(l < k && nums[l] == nums[l+1])
                        l++;
                    while(l < k && nums[k] == nums[k-1])
                        k--;
                    l++;
                    k--;
                }else if(nums[l] + nums[k] < -nums[i]){
                    l++;
                }else{
                    k--;
                }
            }
        }
        return res;
    }
}


