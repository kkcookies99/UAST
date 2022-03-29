     public List<List<Integer>> XXX(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)break;
            int target = -nums[i];
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                if(target<nums[left]+nums[right]){
                    right--;
                }else if(target>nums[left]+nums[right]){
                    left++;
                }else{
                    set.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                }
            }
        }
        return new ArrayList<>(set);
    }

