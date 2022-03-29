 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        int len=nums.length;
        if(len<3)
          return res;
        for(int i=0;i<len;++i){
            if(nums[i]>0)
                return res;
            if(i>0&&nums[i]==nums[i-1])
                continue;
            int l=i+1,r=len-1;
            while(l<r){
                if(nums[i]+nums[l]+nums[r]==0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    }
                while(l<r&&(nums[i]+nums[l]+nums[r]>0||(r<len-1&&nums[r]==nums[r+1])))
                       r--; 
                while(l<r&&(nums[i]+nums[l]+nums[r]<0||(l>i+1&&nums[l]==nums[l-1])))
                       l++;
            }
        }
          return res;
    }
}

