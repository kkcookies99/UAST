class Solution {
   public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> llist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        bt(nums, 0, list, llist);
        return llist;
    }

    public void bt(int[] nums, int i, ArrayList<Integer> list, List<List<Integer>> llist) {
        if (i == nums.length) {
            llist.add(list);
            return;
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        bt(nums, i + 1, list2, llist);
        list.add(nums[i]);
        bt(nums, i + 1, list, llist);
    }
}


