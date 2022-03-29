class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];
        dfs(list, new ArrayList<>(), flag, nums);
        return list;
    }

    public void dfs(List<List<Integer>> list, List<Integer> tempList, boolean[] flag, int[] nums)
    {
        if (tempList.size() == flag.length)
        {
            list.add(new ArrayList<>(tempList));
        }
        else
        {
            for (int i = 0; i < nums.length; i++)
            {
                if (flag[i] == false)
                {
                    tempList.add(nums[i]);
                    flag[i] = true;
                    dfs(list, tempList, flag, nums);
                    flag[i] = false;
                    tempList.remove(tempList.size() - 1);
                }
            }
        }
    }
}

