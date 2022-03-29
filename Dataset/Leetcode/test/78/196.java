class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res=new LinkedList();
        int len=nums.length;
        int s=(1<<len)-1;
        for(int s1=s;s1!=0;s1=(s1-1)&s)
        {
            List<Integer> ans=new LinkedList();
            int num=s1;
            for(int i=0;(num>>>i)!=0;i++)
            {
                if(((num>>>i)&1)==1)
                    ans.add(nums[i]);
            }
            res.add(ans);
        }
        res.add(new LinkedList());
        return res;
    }
}

