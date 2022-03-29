 class Solution {
    List<List<Integer>> rets;
    public List<List<Integer>> XXX(int[] nums) {
        if(nums == null || nums.length < 3) 
            return new ArrayList();
        Arrays.sort(nums);
        rets = new ArrayList();
        thSum(nums, 0);
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]== nums[i-1])//防止第一个数重复
                continue;
            thSum(nums, i);
        }
        return rets;
    }

    public void thSum(int[] nums, int first) {
        int small = first+1, big = nums.length-1;
        while(small < big)
        {
            if(nums[first] + nums[small] + nums[big] == 0){
                List<Integer> list = new ArrayList();
                list.add(nums[first]); 
                list.add(nums[small]);
                list.add(nums[big]);
                rets.add(list);
                small++; big--;
                while(small < big && nums[small] == nums[small-1] && nums[big] == nums[big+1])  // 防止第二、三个数重复
                {small++; big--;}
            }
            else if(nums[first] + nums[small] + nums[big] > 0){
                big--;
            }else{
                small++;
            }
        }
    }
}

