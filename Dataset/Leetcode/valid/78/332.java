    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        XXXRecall(result, new ArrayList<>(), nums, 0);
        return result;
    }
    public void XXXRecall(List<List<Integer>> result,List<Integer> tmp,int[] nums,int index) {
        result.add(tmp);
        if (index >= nums.length) {
            return;
        }
        for (int i = index; i < nums.length; i++) {
            List<Integer> p = new ArrayList<>(tmp);
            p.add(nums[i]);
            XXXRecall(result, p, nums, i + 1);
        }
    }

