 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
	int size;
	List<Integer> temp;
	int i, j, k;
        temp = new ArrayList<Integer>();
	result.add(temp);
	for(i = 0; i < nums.length; i++) {
		size = result.size();
		for(j = 0; j<size; j++) {
			temp = new ArrayList<Integer>();
			if(result.get(j) == null) {
				temp.add(nums[i]);
			}else {
				for(k = 0; k<result.get(j).size(); k++) {
					temp.add(result.get(j).get(k));
				}
				temp.add(nums[i]);
			}
			result.add(temp);
		}
	}
	return result;
    }
}

