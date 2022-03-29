 public int[] XXX(int[] nums, int target) {
 List<Integer> result = new ArrayList();
        Set<Integer> set = new HashSet();
        Set<Integer> set2 = new HashSet();
        for (int i = 0; i < nums.length ; i++) {
            int b = target - nums[i];
            if(set.contains(b)){
                set2.add(nums[i]);
                break;
            }else{
                 set.add(nums[i]);

            }
        }
        set2.stream().forEach(num ->{
            int b = target - num;
            for(int i = 0 ; i < nums.length ; i ++){
                if(nums[i] == num){
                    result.add(i);
                    System.out.println(i);
                }
                if(b == nums[i] && b != num){
                    result.add(i);
                    System.out.println(i);
                }
            }
        });
        int[] ints = result.stream().mapToInt(Integer::valueOf).toArray();
        return ints;
}

