 class Solution {
    public static int[] XXX(int[] nums, int target) {
        int[] result = new int[]{};
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            if(null!= map.get(remain)){
                return new int[] {map.get(remain), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }


    public static void main(String[] args) {
        int[] nums  = new int[]{2, 11, 7, 15};
        int target = 9;
        System.out.println(Arrays.toString(XXX(nums, target)));
    }
}

