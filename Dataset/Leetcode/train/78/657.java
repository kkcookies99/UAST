 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> l1 = new ArrayList();
        int j;
        for(int i =0;i < Math.pow(2,nums.length);i++){
            j = i;
            List<Integer> l2 = new ArrayList();
            for(int m = 0;m < nums.length;m++){                        
                if((j & 1) != 0) l2.add(nums[m]);
                j = j >>> 1;
            }
            l1.add(l2);
        }
        return l1;
    }
}

