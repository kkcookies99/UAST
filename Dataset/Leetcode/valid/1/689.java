 class Solution {
    public int[] XXX(int[] nums, int target) {
        Map<Integer, Integer> list = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++)
            list.put(nums[i], i);
        for(int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if(list.containsKey(tmp) && list.get(tmp) != i) {
                res[0] = i;
                res[1] = list.get(tmp);
                break;
            }
        }

        return res;
    }
}

