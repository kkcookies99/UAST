class Solution {
    public List<List<Integer>> XXX(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        XXX1(nums, nums.length, list);
        return list;

    }

    public void XXX1(int[] nums, int length, List<List<Integer>> list) {

        if (length == 1) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int num : nums) {
                arrayList.add(num);
            }
            list.add(arrayList);
        } else {
            for (int i = 0; i < length; i++) {
                XXX1(nums, length - 1, list);

                int start = nums.length - length;
                int temp = nums[start];
                while (start < nums.length - 1) {
                    nums[start] = nums[start + 1];
                    start++;
                }
                nums[start] = temp;
            }
        }
    }
}

