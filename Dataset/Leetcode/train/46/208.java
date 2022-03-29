class Solution {
    List<List<Integer>> result = new LinkedList<>();
    LinkedList<Integer> temp = new LinkedList<>();
    public List<List<Integer>> XXX(int[] nums) {
         int[] data = new int[nums.length];
        check(nums, data);
        return result;
    }
    public void check(int[] nums, int[] data){
        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return ;
        }
        for(int i = 0; i < nums.length; i++){
            if(data[i] == 0){
                data[i] = 1;
                temp.add(nums[i]);
                check(nums, data);
                data[i] = 0;
                temp.removeLast();
            }
        }
    }
}

