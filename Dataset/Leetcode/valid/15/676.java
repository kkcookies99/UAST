 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> temp = new ArrayList();
        Arrays.sort(nums);
        if(nums.length<3){
            return res;
        }
        for(int i=0;i<nums.length-2&&nums[i]<=0;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int target = -nums[i];
            for(int start=i+1,end=nums.length-1;start<end;){
                if(target==nums[start]+nums[end]){
                    temp.add(nums[i]);
                    temp.add(nums[start]);
                    temp.add(nums[end]);
                    res.add(new ArrayList(temp));
                    temp.clear();
                    start++;
                    end--;
                    while(start<end&&nums[start]==nums[start-1]) start++;
                    while(start<end&&nums[end]==nums[end+1]) end--;
                }else if(target>nums[start]+nums[end]){
                    start++;
                }else if(target<nums[start]+nums[end]){
                    end--;
                }
            }
        }
        return res;
    }
}

