 class Solution {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> XXX(int[] nums) {
        if(nums == null || nums.length == 0){
            return res;
        }
        List<List<Integer>> tmpRes = new LinkedList<>();
        tmpRes.addAll(res);
        for(int i=0;i<nums.length;i++){
            List<Integer> tmp = new LinkedList<>();
            tmp.add(nums[i]);
            res.add(tmp);
            for(int j=0;j<tmpRes.size();j++){
                List<Integer> tmp2 = new LinkedList<>();
                tmp2.addAll(tmpRes.get(j));
                tmp2.add(nums[i]);
                res.add(tmp2);
            }
            tmpRes.clear();
            tmpRes.addAll(res);
        }
        res.add(new LinkedList());
        return res;
    }
}

