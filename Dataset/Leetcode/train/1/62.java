 class Solution {
    public int[] XXX(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap();
        for(int i=0; i<nums.length; i++){
            if(map.get(target - nums[i]) == null){
                map.put(nums[i], i);
            }else{
                int[] a = new int[2];
                a[0] = map.get(target - nums[i]);
                a[1] = i;
                return a;
            }
        }
        return null;
    }
}

