 public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length ==0){
            return list;
        }
        list.add(new ArrayList<>());
        int length = (int)Math.pow(2, nums.length);
        for(int i = 1; i < length; i++) {
            List<Integer> tmpList = new ArrayList<>();
            int tmp = i;
            for(int j = 0; tmp > 0; tmp >>>= 1, j++) {
                if(1 == (tmp & 1)) {
                    tmpList.add(nums[j]);
                }
            }
            list.add(tmpList);
        }
        return list;
    }

