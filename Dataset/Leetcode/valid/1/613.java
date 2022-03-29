 class Solution {
    public int[] XXX(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        int[] x =  new int[nums.length];
        int[] a = new int[2];
        for (int i= 0; i< nums.length;i++){
            if(map.get(nums[i])!=null){
                a[0]=map.get(nums[i]);
                a[1]=i;
                return  a;
            }
            map.put(target-nums[i],i);
        }
        return  a;
    }
}

