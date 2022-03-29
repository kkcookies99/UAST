class Solution {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();
    int[] nums;
    
    public List<List<Integer>> XXX(int[] nums) {
        this.nums = nums;
        for(int i = 0; i<=nums.length; i++) {
            XXX(0, i);
        }
        return res;
    }

    /**
     * 从from开始还要取k个数的集合
     * @param from
     * @param k
     */
    private void XXX(int from, int k) {
        if(k == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(; from < nums.length; from++) {
            list.addLast(nums[from]);
            XXX(from+1, k-1);
            list.removeLast();
        }
    }
}

