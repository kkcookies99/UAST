 class Solution {
    public List<List<Integer>> XXX(int[] nums) 
    {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int k=0;k<nums.length;k++)
        {
            if(nums[k]>0) break;
            if(k>0&&nums[k]==nums[k-1]) continue;
            int l=k+1;
            int r=nums.length-1;
            while(l<r)
            {
                int sum=nums[l]+nums[r]+nums[k];
                if(sum==0)
                {
                    res.add(Arrays.asList(nums[l],nums[r],nums[k]));
                    while(l<r&&nums[l]==nums[l+1]) l++;
                    while(r>l&&nums[r-1]==nums[r]) r--;
                }else if(sum<0) l++;
                 else if(sum>0) r--;
                

            }
        }
        return res;

    }
}

