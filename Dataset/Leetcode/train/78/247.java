class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> XXX(int[] nums) {
        res = new ArrayList<>();
        res.add(new ArrayList<>());
        backTrack(nums, 0, new ArrayList<>());
        return res;
    }

    public void backTrack(int[] nums, int index, List<Integer> list)
    {
        if (index >= nums.length)
        {
            return ;
        }

        for (int i = index; i < nums.length; i++)
        {
            list.add(nums[i]);
            res.add(new ArrayList<>(list));
            backTrack(nums, i+1, list);
            list.remove(list.size()-1);
        }

    }
}

