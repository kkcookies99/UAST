 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        int l=(int)Math.pow(2, nums.length);
        List<List<Integer>> result=new ArrayList<List<Integer>>();
    	for(int i=0;i<l;i++)
    	{
    		List<Integer> cur=new ArrayList<Integer>();
    		for(int j=0;j<nums.length;j++)
    		{
    			if((i & (1<<j))!=0)    			
    				cur.add(nums[j]);    			
    		}
    		result.add(cur);
    	}
        return result;
    }
}

