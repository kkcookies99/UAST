class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<Integer> unused = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            unused.add(nums[i]);
        }
        return f(unused, new ArrayList());
    }

    public List<List<Integer>> f(List<Integer> unused, List<Integer> preList) {
        List<List<Integer>> list = new ArrayList();
        if (unused.size() == 1) {
            preList.add(unused.get(0));
            list.add(preList);
        } else {
            for (int i = 0; i < unused.size(); i++) {
                List<Integer> newUnusedList = new ArrayList();
                newUnusedList.addAll(unused);
                newUnusedList.remove(i);
                List<Integer> newPreList = new ArrayList();
                newPreList.addAll(preList);
                newPreList.add(unused.get(i));
                list.addAll(f(newUnusedList, newPreList));
            }
        }
        return list;
    }
}

