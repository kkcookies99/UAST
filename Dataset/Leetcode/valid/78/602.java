 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        
        for (int i=0; i<nums.length; i++){
            for (int j=0; j<Math.pow(2,i); j++){             
                List<Integer> ls = new ArrayList<>();
                ls.addAll(ans.get(j));
                ls.add(nums[i]);
                ans.add(ls);
            } 
        }
        
        return ans;
    }
}

