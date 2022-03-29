class Solution {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {
        if(nums.length == 0){
            return list;
        }
        backTrack(nums);
        return list;
    }
    public void backTrack(int[] nums){
        if(nums.length == temp.size()){
            list.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            //用来控制i，如果临时数组中有，就跳过，进入下一次循环。
            if(temp.contains(nums[i])){
                continue;
            }
            temp.add(nums[i]);
            backTrack(nums);
            temp.remove(temp.size()-1);
        }
    }
}

