 public List<List<Integer>> XXX(int[] nums) {
        Set<List<Integer>> s=new HashSet<>();
        List<List<Integer>> ret = new ArrayList<>(Collections.singletonList(new ArrayList<>()));
        Arrays.sort(nums);
        int low,high,n=0;
        while(n< nums.length){
            low=n+1;
            high= nums.length-1;
            while(low<high){
                if(nums[low]+nums[high]+nums[n]>0)
                    --high;
                else if(nums[low]+nums[high]+nums[n]<0)
                    ++low;
                else{
                    List<Integer> t=new ArrayList<>();
                    t.add(nums[n]);
                    t.add(nums[low]);
                    t.add(nums[high]);
                    s.add(t);
                    ++low;
                }
            }
            int temp= nums[n];
            while(n< nums.length&&nums[n]==temp)
                ++n;
        }
        ret.clear();
        ret.addAll(s);
        return ret;
    }

