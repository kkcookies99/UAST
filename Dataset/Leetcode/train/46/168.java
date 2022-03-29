class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer>temp = new ArrayList<>();
        if (nums==null || nums.length==0){
            return res;
        }
        backtrack(nums,res,temp);
        return res;
    }

    private void backtrack(int[] nums, List<List<Integer>> res,List<Integer> temp){
        if (temp.size()==nums.length){
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if (temp.contains(nums[i])){//类似于[1,1,1,] [1,1,2]这种就不要
                continue;
            }else {//找出所有排列
                temp.add(nums[i]);
                backtrack(nums,res,temp);
                temp.remove(temp.size()-1);
            }

        }
    }

}

