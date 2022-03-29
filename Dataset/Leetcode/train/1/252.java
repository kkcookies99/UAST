 class Solution {
    public int[] XXX(int[] nums, int target) {
        //学完集合后优化
        Map<Integer,Integer> map=new HashMap<>(nums.length);
        for (int i = 0; i < nums.length ; i++) {
            int key = target - nums[i];
            Integer index = map.get(key);
            if (index == null) {
                map.put(nums[i], i);
            } else {
                return new int[]{i, index};
            }
        }
        return null;


//        for (int i = 0; i < nums.length-1; i++) {
//
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target&&nums[i]!=nums[j]) {
//                    return new int[]{i, j};
//                }
//            }
//        }
    }
}

