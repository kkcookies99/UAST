class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        subset(nums, 0,list, new ArrayList<>());
        list.add(new ArrayList<>());
        return list;
    }

    public void subset(int[] nums, int index, List<List<Integer>> list, List<Integer> list1) {
        if(index >= nums.length)
            return;
        List<Integer> list2 = new ArrayList<>(list1);
        List<Integer> list3 = new ArrayList<>(list1);
        list2.add(nums[index++]);
        list.add(list2);
        subset(nums, index, list, list2);
        subset(nums, index, list, list3);
    }
}

