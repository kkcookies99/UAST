 class Solution {   
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length < 3)  return res;
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int L = i+1, R = nums.length - 1;         
            while(L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    while(L < R && nums[L] == nums[L+1]) L++;
                    while(L < R && nums[R] == nums[R-1]) R--;
                    L++;
                    R--;
                }else if(sum > 0){
                    R--;
                }else{
                    L++;
                }
            }
        }
        return res;
    }
}

