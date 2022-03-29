 class Solution {
    public int XXX(int[] nums) {
        int length = nums.length;
        if(length == 1) {
            return nums[0];
        }

        int max = Integer.MAX_VALUE;
        int tempMax = 0;
        int itemMax = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0;i<length;i++) {
            map.clear();
            tempMax = nums[i];
            map.put(tempMax, i);
            for(int j=i+1; j<length;j++) {
                tempMax += nums[j]; 
                map.put(tempMax, j);
            }
            itemMax = map.lastKey();

            if(max == Integer.MAX_VALUE) {
                max = itemMax;
            } else {
                if(itemMax > max) {
                    max = itemMax;
                }
            }
        }
        return max;
    }
}

