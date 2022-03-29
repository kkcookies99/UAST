 public int[] XXX(int[] nums, int target) {
        int[] result = null;
        HashMap<Integer, Integer> integerMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sub = target-nums[i];
            if(integerMap.containsKey(sub)){
                result = new int[2];
                result[1]=i;
                result[0]=integerMap.get(sub);
                break;
            }
            integerMap.put(nums[i],i);
        }
        return result;
    }

