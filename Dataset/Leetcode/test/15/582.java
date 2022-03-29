 public List<List<Integer>> XXX(int[] nums) {
           List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        if(nums.length < 3) return res;
        Arrays.sort(nums);
        if(nums[0] > 0 || nums[nums.length - 1] < 0) return res;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i -1]){
                continue;
            }
            int target = -nums[i];
            //nums[j]需要target - nums[j]才能凑出target
            for(int j = i + 1;j < nums.length;j++) {
                if(map.containsKey(nums[j])) {
                    //System.out.println("nums[i]:"+nums[i]+", " + "nums[j]:"+nums[j]+", " + "nums[j] - target):"+ (nums[j] - target));
                    set.add(Arrays.asList(nums[i],nums[map.get(nums[j])], nums[j]));
                }else{
                    map.put(target - nums[j], j);
                }
            }
            map.clear();
        }
        for(List<Integer> list : set) {
            res.add(list);
        }
        return res;
    }

