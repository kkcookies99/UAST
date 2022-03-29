     public int[] XXX(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] out = new int[2];
        int length = nums.length;

        for(int index = 0; index < length; index++){
            int key = target - nums[index];
            if(map.get(key) != null){
                out[0] = index;
                out[1] = map.get(key);
                return out;
            }
            else{
                map.put(nums[index], index);
            }

        }

        return out;
    }

