class Solution {
    List<List<Integer>> resList;
    List<Integer> tmpList;
    public List<List<Integer>> XXX(int[] nums) {
        resList = new ArrayList<>();
        tmpList = new ArrayList<>();
        if(nums.length == 0) return resList;

        resList.add(new ArrayList<>());
        findSubsets(nums,0);
        
        return resList;
    }
    private void findSubsets(int[] nums, int index) {
        if(index >= nums.length) return;

        for(int i = index; i < nums.length; i++) {
            tmpList.add(nums[i]);
            resList.add(new ArrayList<>(tmpList));
            findSubsets(nums, i + 1);
            tmpList.remove(tmpList.size() - 1);
        }
    }
}