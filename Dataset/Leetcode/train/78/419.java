 class Solution {
    List<List<Integer>> result = new LinkedList<>();
    public List<List<Integer>> XXX(int[] nums) {
        List<Integer> sub = new LinkedList<>();
	    process(nums,0,sub);
	    return result;
    }
    private void process(int[] nums, int index, List<Integer> sub) {
	    if(index==nums.length){	    		
	    	result.add(sub);
	        return;
	    }
//	 	加
	    List<Integer> plusSub = new LinkedList<>(sub);
	    plusSub.add(nums[index]);
	    process(nums,index+1,plusSub);
//	          不加
	    List<Integer> noPlusSub = new LinkedList<>(sub);
	    process(nums,index+1,noPlusSub);
	}
}

