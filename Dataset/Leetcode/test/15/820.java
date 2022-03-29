 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        /*HashSet<Integer> set = new HashSet<Integer>();
        for(int x:nums)
            set.add(x);
        
        int len=set.size();
        int[] arr=new int[len];
        int z=0;
        for(int y:set)
            arr[z++]=y;*/

        Arrays.sort(nums);
        int len=nums.length;

        HashSet<List<Integer>> result=new HashSet<List<Integer>>();
        for(int i=0;i<len;i++)
        {
            int sum=nums[i];
            for(int j=i+1;j<len;j++)
            {
                sum+=nums[j];
                for(int k=j+1;k<len;k++)
                {
                    sum+=nums[k];
                    if(sum==0)
                    {
                        List<Integer> tmp=new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);
                        result.add(tmp);
                    }
                    sum-=nums[k];
                }
                sum-=nums[j];
            }
        }

        List<List<Integer>> res=new ArrayList<List<Integer>>();
        for(List x : result)
            res.add(x);
     return res;
    }
}

