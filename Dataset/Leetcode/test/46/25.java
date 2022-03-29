class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> XXX(int[] nums) {

        for (int i = 0; i < nums.length; i++){
            dfs(nums, new ArrayList<>(), i,new ArrayList<>());
        }
        return res;
    }

    public void dfs(int[] nums, List<Integer> list, int index,List<Integer> indexRecord){
        list.add(nums[index]);
        indexRecord.add(index);

        if (indexRecord.size() == nums.length){
            List<Integer> newList = new ArrayList<>(list);
            res.add(newList);
            return;
        }

        for (int i = 0; i < nums.length; i++){
            if (indexRecord.contains(i)) continue;

            dfs(nums, list, i,indexRecord);

            list.remove(list.size() - 1);
            indexRecord.remove(indexRecord.size() - 1);
        }
    }
}

