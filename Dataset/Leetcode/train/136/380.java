 class Solution {
    public int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new TreeMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], 2);
            }else map.put(nums[i], 1);
        }

        for(int key: map.keySet()){
            if(map.get(key) == 1) return key;
        }

        return -1;
    }
}

