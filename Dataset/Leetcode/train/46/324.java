class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        //存储结果
        List<List<Integer>> res = new LinkedList<>();
        //记录路径
        LinkedList<Integer>  track = new LinkedList<>();
        trackback(nums,track,res);
        return res;
    }
    public void trackback(int[] nums,LinkedList<Integer>  track,List<List<Integer>> res){
        //到达叶子节点存储当前路径
        if (track.size()==nums.length){
            res.add(new LinkedList<>(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // 排除已经有的节点
            if (track.contains(nums[i])) continue;
            //做选择
            track.add(nums[i]);
            // 下一层遍历
            trackback(nums,track,res);
            //取消选择
            track.removeLast();
        }
    }
}

