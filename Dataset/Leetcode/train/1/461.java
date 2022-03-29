 public int[] XXX(int[] nums, int target) {
    int[] ret = new int[2];
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length; i++) {
        map.put(nums[i],i);
    }
    
    for(int i = 0; i < nums.length; i++) {
        int num = target - nums[i];
        if(map.containsKey(num) && map.get(num) != i) {
            ret[0] = i;
            ret[1] = map.get(num);
            break;
        }
    }
    return ret;
}
