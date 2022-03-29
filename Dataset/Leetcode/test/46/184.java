class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0)
            return res;     
        process(nums, 0, res);
        return res;
    }
    
    public void process(int[] nums, int i, List<List<Integer>> res){
        //base case
        if(i == nums.length-1){
            //int[] -> list<Integer> 麻烦点
            ArrayList<Integer> tmp = new ArrayList<>();
            for(int k=0; k < nums.length;k++)
                tmp.add(nums[k]);
            res.add(tmp);
            return;
        }
        
        //从i位置开始尝试，i...都可以来到i位置
        for (int j = i; j < nums.length; j++) {
            swap(nums, i, j);
            process(nums, i+1, res);
            swap(nums, j, i);
        }
    }
    
    private void swap(int[] chs, int i, int j) {
        int tmp = chs[i];
        chs[i] = chs[j];
        chs[j] = tmp;
    }
}

