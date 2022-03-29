class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        int n = nums.length;
        List<List<Integer>> r = new ArrayList<List<Integer>>();
        r.add(new ArrayList<Integer>());
        for (int i = 0; i < n; i++) {
            int length = r.size();
            for (int j = 0; j < length; j++) {
                List<Integer> a = new ArrayList<Integer>();
                a.addAll(r.get(j));
                a.add(nums[i]);
                r.add(a);
            }
        }
        return r;
    }
}

