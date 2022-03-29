class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        if (nums == null || nums.length == 0)
            return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        helper(result, nums, 0);
        return result;
    }

    public void helper(List<List<Integer>> result, int[] arr, int index) {
        if (index == arr.length) {
            result.add(Arrays.stream(arr).boxed().collect(Collectors.toList()));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            helper(result, arr, index + 1);
            swap(arr, index, i);
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

