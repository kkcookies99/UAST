     public List<List<Integer>> XXX(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> hash = new HashSet<>(nums.length << 1);
        Set<List<Integer>> ans = new HashSet<>();
        for(int i=0; i<nums.length; ++i){
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }

            hash.clear();
            for(int j=i+1; j<nums.length; ++j){
                if(hash.contains(-nums[i]-nums[j])){
                    List<Integer> tuple = new ArrayList<>(3);
                    tuple.add(nums[i]);
                    tuple.add(-nums[i]-nums[j]);
                    tuple.add(nums[j]);
                    tuple.sort(Comparator.naturalOrder());
                    ans.add(tuple);
                }else{
                    hash.add(nums[j]);
                }
            }
        }
        return new ArrayList<>(ans);
    }

