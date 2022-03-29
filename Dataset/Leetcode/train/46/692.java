 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                res.add(Arrays.asList(new Integer[] {nums[i]}));
                continue;
            }
            List<List<Integer>> tmp = new ArrayList<>();
            int size = res.size();
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < i + 1; k++) {
                    List<Integer> list = res.get(j);
                    List<Integer> l = new ArrayList<>(list);
                    l.add(k, nums[i]);
                    tmp.add(l);
                }              
            }
            res = tmp;
            //System.out.println(res);
        }
        if (nums.length == 0) {
            res.add(new ArrayList<>());
        }
        return res;
    }
}

