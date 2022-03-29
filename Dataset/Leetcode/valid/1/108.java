     public int[] XXX(int[] nums, int target) {
        HashSet<Integer> record = new HashSet<>();
        int len = nums.length;
        for(int i = 0;i < len;i ++){
            for(int j = i + 1;j < len;j ++){
                if(nums[i] + nums[j] == target){
                    record.add(i);
                    record.add(j);
                }
            }
        }
    int[] res = new int[record.size()];
    int index = 0;
    for(int i:record){//这个i贯穿了record
        res[index++] = i;
    }
    return res;
    }
}

