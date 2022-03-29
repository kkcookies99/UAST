class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        if(nums == null) return null;
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        ans.add(new ArrayList<Integer>());//添加空集合
        for(int i = nums.length - 1; i >= 0; i--){
        	int value = nums[i];
        	for(int j = 0, size = ans.size(); j < size; j++){
        		ArrayList<Integer> newList = new ArrayList<Integer>();
        		newList.add(value);
        		newList.addAll(ans.get(j));
        		ans.add(newList);
        	}
        }
        return ans;
    }
}

