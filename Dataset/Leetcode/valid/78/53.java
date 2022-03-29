class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {
        List<Integer> element = new ArrayList<>();
        process(nums,0,element);
        return result;
    }


    private void process(int[] nums,int i,List<Integer> temp) {
        if (i==nums.length){
            result.add(temp);
            return;
        }
        List<Integer> newtemp = new ArrayList<>(temp);
        process(nums,i+1,temp);
        newtemp.add(nums[i]);
        process(nums,i+1,newtemp);
    }
}

