 public int singleNumber(int[] nums) {
 Set<Integer> mySet = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (!mySet.add(nums[i])){
                mySet.remove(nums[i]);
            }            
        }
        List<Integer> list = new ArrayList(mySet);
        return list.get(0);
    }

