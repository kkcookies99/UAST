     public List<List<Integer>> XXX(int[] nums) {
    	//有多少个子集
    	int count = 1<<nums.length;
    	//结果
    	 List<List<Integer>> result = new ArrayList<List<Integer>>();
    	//取每种情况
    	for(int i=0;i<count;i++){
    		List<Integer> ls = new ArrayList<Integer>();
    		//分析当前情况的所含的子集
    		for(int j=0;j<nums.length;j++){
    			//取j+1位 看是否为1
    			if (1 == ((i>>j)&1)){
    				ls.add(nums[j]);
    			}
    		}
    		result.add(ls);
    	}
    	return result;
    }

