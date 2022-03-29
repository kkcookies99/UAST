 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(nums[0]);
        result.add(list1);
        for(int i = 1; i<nums.length; i++){ 
            List<List<Integer>> temp = new ArrayList<>();
            for(int j =0; j<result.size(); j++){
                for(int m = 0; m<= result.get(j).size();m++){
                    List<Integer> templist = new ArrayList<>(result.get(j));
                    templist.add(m,nums[i]);
                    temp.add(templist);
                }
            }
            result = temp;
        } 
        return result;
    }
} 

