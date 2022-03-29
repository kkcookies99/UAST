 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
       List<List<Integer>> listss = new ArrayList<>();
        List<Integer> lists = new ArrayList<>();    
        listss.add(lists);
       
        for(int i = 0; i < nums.length; i++) {
            int length = listss.size();
            for(int j = 0; j < length; j++) {
                List<Integer> list = listss.get(j);
                List<Integer> listTwo = new ArrayList<>(list);
                listTwo.add(nums[i]);
                listss.add(listTwo);
            }
        }
        return listss;
    }
}

