 public int[] XXX(int[] nums, int target) {
         if(nums == null || nums.length == 0){
            throw new RuntimeException("nums is blank");
        }

        Map<Integer , Integer> map = new LinkedHashMap<Integer, Integer>(nums.length);
        for (int i = 0 ; i < nums.length ; i ++){
            int difference = target - nums[i];
            if(map.containsKey(difference) && map.get(difference) != i){
                return new int[]{ map.get(difference ) , i};
            }
            map.put(nums[i] , i);
        }
        throw new RuntimeException("no index");
    }

