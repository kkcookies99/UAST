class Solution {
    // backtrack(路径，选择列表){
    // // 结束条件(选择列表长度达到路径长度)
    // // 将中间结果加入结果集
    // for 选择 in 选择列表:
    //     //做选择，并将该选择从选择列表中移除
    //     路径.add(选择)
    //     backtrack(路径，选择列表)      
    //     //撤销选择 
    //     路径.remove(选择)
    // }

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> XXX(int[] nums) {
        //路径：记录在 track 中
        List<Integer> track = new LinkedList<>();
        backtrack(nums, track);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> track) {
        // 结束条件: nums 中的元素全都在 track 中出现(长度一致)
        if(track.size() == nums.length){
            result.add(new ArrayList<>(track));
            return;
        }
        // 选择列表：nums 中不存在于 track 的那些元素
        for(int i = 0; i<nums.length; i++){
            if(track.contains(nums[i])){
                continue;
            }
            //做选择
            track.add(nums[i]);
            backtrack(nums, track);
            //撤销选择，上一步的选择元素即track的最后加入的元素，索引为track.size() - 1
            track.remove(track.size() - 1);
        }
    }
}

