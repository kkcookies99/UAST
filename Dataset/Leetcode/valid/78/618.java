 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>((int) Math.pow(2, nums.length));
        lists.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int size = lists.size();
            List<List<Integer>> list = new ArrayList<>(size);
            for (int j = 0; j < size; j++) {
                List<Integer> integerList = new ArrayList<>();
                integerList.addAll(lists.get(j));
                integerList.add(nums[i]);
                list.add(integerList);
            }
            lists.addAll(list);
        }
        return lists;
    }
}

