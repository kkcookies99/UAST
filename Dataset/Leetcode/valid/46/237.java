class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> L=new ArrayList<List<Integer>>();
        List<Integer> l=new ArrayList<Integer>();
        if(nums.length!=0) {
        	List<Integer> numslist=new ArrayList<Integer>();
        	for(int i=0;i<nums.length;i++)
        		numslist.add(nums[i]);
			fun_XXX(nums, L, numslist,l);
		}
		return L;
    }
	public static void fun_XXX(int [] nums,List<List<Integer>> L,List<Integer> N,List<Integer> l) {
		if(N.size()==0) {
			L.add(l);
		}else {
			for(int i=0;i<N.size();i++) {
				List<Integer> ltemp=new ArrayList<Integer>(l);
				List<Integer> ntemp=new ArrayList<Integer>(N);
				ltemp.add(ntemp.get(i));
				ntemp.remove(i);
				fun_XXX(nums, L, ntemp,ltemp);
			}
		}
	}
}

