class Solution {

        public List<List<Integer>> XXX(int[] nums) {
            List<List<Integer>> result = new LinkedList<>();
            result.add(Collections.emptyList());
            if (nums == null || nums.length == 0) {
                return Collections.emptyList();
            }
            if (nums.length == 1) {
                result.add(Collections.singletonList(nums[0]));
                return result;
            }
            doSubSet(nums, 0, new LinkedList<>(), result);
            return result;
        }

        private void doSubSet(int[] nums, int index, LinkedList<Integer> tempResult, List<List<Integer>> result) {
            for (int i = index; i != nums.length; ++i) {
                tempResult.add(nums[i]);
                result.add(new ArrayList<>(tempResult));
                doSubSet(nums, i + 1, tempResult, result);
                tempResult.removeLast();
            }
        }
}

