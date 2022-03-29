public List<List<Integer>> XXX(int[] nums) {
    List<List<Integer>> resList = new ArrayList<>();
    if (nums == null || nums.length == 0)
        return resList;
    XXX(nums, 0, resList);
    return resList;
}

private void XXX(int[] nums, int start, List<List<Integer>> resList) {
    if (start == nums.length - 1) {
        List<Integer> arrList = transferList(nums);
        resList.add(arrList);
        return;
    }
    for (int i = start + 1; i < nums.length; i++) {
        swap(nums, start, i);
        XXX(nums, start + 1, resList);
        swap(nums, start, i);
    }
}

private List<Integer> transferList(int[] nums) {
    List<Integer> arrList = new ArrayList<>(nums.length);
    for (int i = 0; i < nums.length; i++)
        arrList.add(nums[i]);
    return arrList;
}

private void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
}

