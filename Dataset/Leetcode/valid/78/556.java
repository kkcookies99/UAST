 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> listAll = new ArrayList<>();
        listAll.add(new ArrayList<>());
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            List<List<Integer>> tmpListAll = new ArrayList<>();
            for (int j = 0; j < listAll.size(); j++) {
                List<Integer> list = listAll.get(j);
                List<Integer> tmp = new ArrayList<>(list);
                tmp.add(nums[i]);
                tmpListAll.add(list);
                tmpListAll.add(tmp);
            }
            listAll = tmpListAll;

        }
        return listAll;
    }
}

