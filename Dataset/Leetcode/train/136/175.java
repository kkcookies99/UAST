 class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> distinctMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (Objects.isNull(distinctMap.get(nums[i]))){
                distinctMap.put(nums[i],1);
            } else {
                distinctMap.put(nums[i],2);
            }
        }

        for (Map.Entry<Integer, Integer> entry : distinctMap.entrySet()) {
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return 0;
    }
}

